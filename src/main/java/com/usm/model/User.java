package com.usm.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User extends Base {

	private String login;
	private String password;
	private Set<Wherefrom> wherefroms;
	private Set<Domain> domains;
	private Set<Income> incomes;
	private Set<Expense> expenses;

	public User() {}

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Column
	@NotNull(message = "This field is required.")
	@Size(min = 6, max = 50, message = "Login length should be between 6 and 50.")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column
	@NotNull(message = "This field is required.")
	@Size(min = 6, max = 50, message = "Password length should be between 6 and 50.")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	public Set<Wherefrom> getWherefroms() {
		return wherefroms;
	}

	public void setWherefroms(Set<Wherefrom> wherefroms) {
		this.wherefroms = wherefroms;
	}

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	public Set<Domain> getDomains() {
		return domains;
	}

	public void setDomains(Set<Domain> domains) {
		this.domains = domains;
	}

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	public Set<Income> getIncomes() {
		return incomes;
	}

	public void setIncomes(Set<Income> incomes) {
		this.incomes = incomes;
	}

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	public Set<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + "]";
	}

}
