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
@Table(name = "wherefroms")
public class Wherefrom extends Base {
	
	private User user;
	private String wherefrom;

	public Wherefrom() {}

	public Wherefrom(User user, String wherefrom) {
		this.user = user;
		this.wherefrom = wherefrom;
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
	public String getWherefrom() {
		return wherefrom;
	}

	public void setWherefrom(String wherefrom) {
		this.wherefrom = wherefrom;
	}
		
}
