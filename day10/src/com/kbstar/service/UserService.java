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
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check..."); // 보안췤!
		try {
			dao.insert(v); // 얘가 DB에 들어가는 data
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send mail..."); // 가입 메일
		System.out.println("Send SMS..."); // 가입 문자
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS...");
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			//바로 쓰로우즈 안하고 트라이 캐치로 하면 예외 발생시 Log가 찍힌다
			throw e;
		}
		System.out.println("Send SMS...");
	}

}
