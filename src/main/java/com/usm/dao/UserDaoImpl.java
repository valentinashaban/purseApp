package com.usm.dao;

import com.usm.model.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public UserDaoImpl(Class<User> type) {
		super(type);
	}

}
