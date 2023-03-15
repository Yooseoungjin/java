package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO> {

	HashMap<String, TransactionDTO> db;

	public TransactionDAO() {

		db = new HashMap<String, TransactionDTO>();
	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		if (db.containsKey(v.getDate())) {
			throw new Exception("DB Error");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for (TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	@Override
	public void delete(String k) throws Exception {

	}

	@Override
	public void update(TransactionDTO v) throws Exception {

	}

	// 고객이 보유 하고 있는 계좌번호를 입력 하면
	// 해당 계좌의 거래 내역을 조회한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();

		for (TransactionDTO tr : col) {
			// 계좌 중에서 id가 obj와 같은 것들만 list에 넣어라
			if ((tr.getAccNo()).equals(obj)) {
				list.add(tr);
			}

		}
		return list;
	}
}
