package com.ofss.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_details")
public class LoginDetails {
	@Id
	@Column(name = "login_id")
	private String loginId;
	private String name;
	private String password;
	private boolean status;
	private int count;

	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(String loginId, String name, String password, boolean status, int count) {
		super();
		this.loginId = loginId;
		this.name = name;
		this.password = password;
		this.status = status;
		this.count = count;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", name=" + name + ", password=" + password + ", status=" + status
				+ ", count=" + count + "]";
	}

}
