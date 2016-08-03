package com.usm.dao;

import java.util.List;

public interface BaseDao<T> {
	void save(T entity);
	T getOne(Long id);
	List<T> getAll();
	void update(Long id);
	void update(T entity);
	void delete(Long id);
	void delete(T entity);
}
