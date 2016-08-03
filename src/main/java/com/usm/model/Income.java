package com.usm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "incomes")
public class Income extends Base {

	private User user;
	private Wherefrom wherefrom;
	private Double amount;
	private String description;
	private Date date;

	public Income() {}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	@NotNull
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_wherefrom")
	public Wherefrom getWherefrom() {
		return wherefrom;
	}

	public void setWherefrom(Wherefrom wherefrom) {
		this.wherefrom = wherefrom;
	}

	@Column
	@NotNull(message = "This field is required.")
	@Min(value = 0, message = "Minimal amount is 0.")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column
	@Size(min = 0, max = 300, message="Max size of description is 300.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "i_date")
	@NotNull(message = "This field is required.")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
