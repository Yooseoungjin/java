package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.UserMariaDBDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
//		DAO dao = new AccountMariaDBDAO();
//		AccountDTO account = new AccountDTO("100","자유예금",1000);
//		dao.insert(account);
		DAO dao = new UserMariaDBDAO();
		UserDTO user = new UserDTO("id01", "pwd01", "james");
		dao.insert(user);

	}

}
