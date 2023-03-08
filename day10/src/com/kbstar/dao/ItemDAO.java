package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(v.getId() == 1000) {
			throw new Exception("EX0004");
		}
		connect();
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	@Override
	public void delete(Integer k) throws Exception {
		connect();
		if(k == 1000) { // k는 바로 int 값이라 == 숫자로
			throw new Exception("EX0005");
		}
		System.out.println(k);
		System.out.println("Deleted...");	
		close();
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId() == 1000) {
			throw new Exception("EX0006");
		}
		System.out.println(v);
		System.out.println("Updated...");	
	}

}
