package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

	public CartDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("로딩 성공");
	}

	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUser_id());
			pstmt.setString(3, v.getItem_id());
			pstmt.setInt(4, v.getCnt());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				System.out.println(k + "는 장바구니에 없는 id입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.cartUpdateSql);) {
			pstmt.setInt(1, v.getCnt());
			pstmt.setString(2, v.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String user_id = rset.getString("user_id");
				String item_id = rset.getString("item_id");
				int cnt = rset.getInt("cnt");
				Date regdate = rset.getDate("regdate");
				cart = new Cart(id, user_id, item_id, cnt, regdate);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return cart;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		List<Cart> list = new ArrayList<>();
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					Cart cart = null;
					String id = rset.getString("id");
					String user_id = rset.getString("user_id");
					String item_id = rset.getString("item_id");
					int cnt = rset.getInt("cnt");
					Date regdate = rset.getDate("regdate");
					cart = new Cart(id, user_id, item_id, cnt, regdate);
					list.add(cart);
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cart> selectUser(String k) throws Exception {
		List<Cart> list = new ArrayList<>();

		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectUserSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
				Cart cart = null;
				String id = rset.getString("id");
				String user_id = rset.getString("user_id");
				String item_id = rset.getString("item_id");
				int cnt = rset.getInt("cnt");
				Date regdate = rset.getDate("regdate");
				cart = new Cart(id, user_id, item_id, cnt, regdate);
				list.add(cart);
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}


	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
