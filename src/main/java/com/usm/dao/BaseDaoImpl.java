package com.usm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.usm.config.HibernateUtil;

public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> type;

	public BaseDaoImpl(Class<T> type) {
		this.type = type;
	}

	private Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public void save(T entity) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
	}

	@Override
	public T getOne(Long id) {
		Session session = null;
		T entity = null;
		try {
			session = getSession();
			entity = (T) session.load(type, id);
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
		return entity;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<T> getAll() {
		Session session = null;
		List<T> entities = new ArrayList<>();
		try {
			session = getSession();
			entities = session.createCriteria(type).list();
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
		return entities;
	}

	@Override
	public void update(Long id) {
		T entity = getOne(id);
		update(entity);
	}

	@Override
	public void update(T entity) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			session.update(entity);
			session.getTransaction().commit();
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
	}

	@Override
	public void delete(Long id) {
		T entity = getOne(id);
		delete(entity);
	}

	@Override
	public void delete(T entity) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			session.delete(entity);
			session.getTransaction().commit();
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
	}

}
