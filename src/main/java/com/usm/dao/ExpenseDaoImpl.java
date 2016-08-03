package com.usm.dao;

import com.usm.model.Expense;

public class ExpenseDaoImpl extends BaseDaoImpl<Expense> implements ExpenseDao {

	public ExpenseDaoImpl(Class<Expense> type) {
		super(type);
	}

}
