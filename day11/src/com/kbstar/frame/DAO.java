package com.kbstar.frame;

import java.util.List;

public interface DAO <K,V> {
	public void insert(V v) throws Exception;
	public void Delete(K k) throws Exception;
	public void Update(V v) throws Exception;
	public  V select(K k) throws Exception;
	public List<V> select() throws Exception;
}
