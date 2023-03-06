package com.kbstar.frame;

public interface DAO<K,V> { //제네릭사용
	public void insert(V v);

	public void delete(K k);

	public void update(V v);
}
