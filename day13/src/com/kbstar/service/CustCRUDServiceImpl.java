package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		// 데이타 검증
		// DB 입력
		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복 되었다");
			} else {
				throw new Exception("시스템 장애입니다.");
			}
		}

		// Email.SMS 전송

	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당ID가 존재하지 않음");
			}
		}
	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try { // 이 트라이 캐치문을 포함 하면 custdaoimpl의 예외사항을 화면에 바로 던지지 않고 아래 캐치문을 반영함(고객이 보는 화면용 용어로 다듬기 위함)
			cust = dao.select(k); // custdaoimpl에서 날아오는 예외사항 받는위치. 트라이 캐치가 없다면 위 스로우로 app으로 다시 던짐
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) { // 네트워크 오류
				throw new Exception("시스템 장애 입니다. 잠시 후 재접속 바래요~");
			} else {
				throw new Exception("ID가 존재하지 않습니다.");
			}
		}
		return cust;
	}	
	
	@Override
	public List<Cust> get() throws Exception {
			List<Cust> list = null;
			try { 
				list = dao.selectAll();
			} catch (Exception e) {
				if (e instanceof SQLRecoverableException) {
					throw new Exception("시스템 장애 입니다. 잠시 후 재접속 바래요~");
				} else {
					throw new Exception("ID가 존재하지 않습니다.");
				}
			}
		return list;
	}

}
