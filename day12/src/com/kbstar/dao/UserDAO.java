package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	HashMap<String, UserDTO> db; //오라클을 연동안해서 해쉬맵을 db로 쓰려고 넣은 코드

	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception("DB ERROR");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void Delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("아이디 없음");
		}
		db.remove(k);
	}

	@Override
	public void Update(UserDTO v) throws Exception {
		if (!db.containsKey(v.getId())) {
			throw new Exception("아이디 없음");
		}
		db.put(v.getId(), v);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		
		for(UserDTO obj:col) {
			list.add(obj);
		}		
		return list;
	}

	@Override
	public List<UserDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
