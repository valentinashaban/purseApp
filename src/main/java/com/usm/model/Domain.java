package com.usm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "domains")
public class Domain extends Base {

	private User user;
	private String domain;
	
	public Domain() {}

	public Domain(User user, String domain) {
		this.user = user;
		this.domain = domain;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	@NotNull
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column
	@NotNull(message = "This field is required.")
	@Size(min = 0, max = 50, message = "Max size is 50.")
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
