package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {

	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() { // 이 부분은 스프링을 배우면 필요없는데 여기서는 필요함
		custDao = new CustDaoImpl(); // 이 부분은 스프링을 배우면 필요없는데 여기서는 필요함
		itemDao = new ItemDaoImpl(); // 이 부분은 스프링을 배우면 필요없는데 여기서는 필요함
		cartDao = new CartDaoImpl(); // 이 부분은 스프링을 배우면 필요없는데 여기서는 필요함
	}

	@Override
	public Cust login(String id, String pwd) throws Exception { // day12의 로그인 참고 해서 작성할 것
		Cust cust = null;
		cust = custDao.select(id);
		if (cust != null) {
			if (cust.getPwd().equals(pwd)) {
				System.out.println("로그인 성공~");
			} else {
				throw new Exception("비번확인 해봐~");
			}
		} else {
			throw new Exception("없는 아이디~");
		}
		return cust;
	}

	@Override
	//회원가입 
	public void register(Cust v) throws Exception {
		try {
			custDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록오류");
		}
//		notification.sendEmail(v.getEmail(), "축하 합니다....");
//		notification.sendSMS(v.getContact(), "진심으로 축하합니다...");
	}

	@Override
	public List<Cart> myCart(String id) throws Exception {
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
	}

}
