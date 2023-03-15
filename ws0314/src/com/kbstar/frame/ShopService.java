package com.kbstar.frame;

import java.util.List;

public interface ShopService<V,C> {
	public V login(String id, String pwd) throws Exception;
	public void register(V v) throws Exception;
	public List<C> myCart(String id) throws Exception; //나의 id를 넣으면 카트정보를 조회해라
	
}
