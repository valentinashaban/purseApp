package com.usm.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;

import com.usm.model.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public UserDaoImpl(Class<User> type) {
		super(type);
	}

	@SuppressWarnings("deprecation")
	@Override
	public User findByLogin(String login) {
		Session session = null;
		User user = null;
		try {
			session = super.getSession();
			user = (User) session.createQuery("from User where login = :login").setString("login", login).getSingleResult();
		} catch (NoResultException ex) {
			return null;
		} finally {
			if (null != session && session.isOpen())
				session.close();
		}
		return user;
	}

}
