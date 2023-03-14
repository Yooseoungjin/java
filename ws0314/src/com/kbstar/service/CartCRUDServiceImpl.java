package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {

	DAO<String, String, Cart> dao;

	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}
	
	@Override
	public void register(Cart v) throws Exception {
		try {
			String id = MakeItemNumber.makeCartNum();
			v.setId(id);
			dao.insert(v);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("id가 중복되었습니다.");
			} else {
				throw new Exception("시스템 장애 입니다.");
			}
		}

	}

	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복 되었습니다.");
			} else {
				throw new Exception("시스템 장애 입니다.");
			}
		}
	}	

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("네트워크 오류 발생!");
			} else {
				throw new Exception("입력하신 ID에 해당하는 정보가 없습니다!");
			}
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = null;
		try {
			list = dao.selectAll();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다. 잠시 후 재접속 바라요~");
			} else {
				throw new Exception("ID가 존재하지 않습니다.");
			}
		}
		return list;
	}

	@Override
	public List<Cart> getUserSelection(String k) throws Exception {
		List<Cart> list = null;
		try {
			list = dao.selectUser(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다. 잠시 후 재접속 바라요~");
			} else {
				throw new Exception("ID가 존재하지 않습니다.");
			}
		}
		return list;
	}

}
