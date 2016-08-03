package com.usm.config;

import com.usm.dao.*;
import com.usm.model.*;

public class Factory {
	
	private static UserDao userDao = null;
	private static IncomeDao incomeDao = null;
	private static ExpenseDao expenseDao = null;
	private static WherefromDao wherefromDao = null;
	private static DomainDao domainDao = null;
	private static Factory instance = null;
	
	public static synchronized Factory getInstance() {
		if (null == instance)
			instance = new Factory();
		return instance;
	}
	
	public UserDao getUserDao() {
		if (null == userDao)
			userDao = new UserDaoImpl(User.class);
		return userDao;
	}
	
	public IncomeDao getIncomeDao() {
		if (null == incomeDao)
			incomeDao = new IncomeDaoImpl(Income.class);
		return incomeDao;
	}
	
	public ExpenseDao getExpenseDao() {
		if (null == expenseDao)
			expenseDao = new ExpenseDaoImpl(Expense.class);
		return expenseDao;
	}
	
	public WherefromDao getWherefromDao() {
		if (null == wherefromDao)
			wherefromDao = new WherefromDaoImpl(Wherefrom.class);
		return wherefromDao;
	}
	
	public DomainDao getDomainDao() {
		if (null == domainDao)
			domainDao = new DomainDaoImpl(Domain.class);
		return domainDao;
	}
	
}
