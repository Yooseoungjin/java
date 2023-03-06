package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {

	DAO<String, UserDTO> dao;

	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public void register(UserDTO v) {
		System.out.println("Security Check..."); // 보안췤!
		dao.insert(v); // 얘가 DB에 들어가는 data
		System.out.println("Send mail..."); // 가입 메일
		System.out.println("Send SMS..."); // 가입 문자
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send SMS...");
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("Send SMS...");
	}

}
