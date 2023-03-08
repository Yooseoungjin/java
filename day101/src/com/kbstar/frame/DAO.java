package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.ItemDTO;

public interface DAO<K,V> {
	//CRUD(Create,Read,Update,Delete)
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;  // id가 입력된 k를 가져와라
	public List<V> select() throws Exception; // 우리 회사의 고객정보 다가져와

}
