package com.kbstar.dao;

import java.util.HashMap;
import java.util.List;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	HashMap<Integer, ItemDTO> db = null;

	public ItemDAO() {
		db = new HashMap<>(); // db로 사용될 해쉬맵~
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())){
			throw new Exception();
		}
		db.put(v.getId(), v);
		System.out.println(v);
		System.out.println("Inserted...");
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db.containsKey(k)){
			throw new Exception();
		}
		System.out.println(k);
		System.out.println("Deleted...");
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getId())){
			throw new Exception();
		}
		System.out.println(v);
		System.out.println("Updated...");
	}

	@Override
	public ItemDTO select(Integer k) throws Exception {
		ItemDTO item = null;
		if (!db.containsKey(k)) {
			throw new Exception();
		}
		item = db.get(k);
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
