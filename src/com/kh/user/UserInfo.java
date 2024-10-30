package com.kh.user;

import java.sql.Date;

public class UserInfo {
	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private String rrn;
	private String phone;
	private String address;
	private String adAccept;
	private Date enrollDate;
	private String status;
	
	
	public UserInfo() {
		super();
	}

	
	public UserInfo(String userId, String userPw, String userName, String email, String rrn, String phone,
			String address, String adAccept, Date enrollDate, String status) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.email = email;
		this.rrn = rrn;
		this.phone = phone;
		this.address = address;
		this.adAccept = adAccept;
		this.enrollDate = enrollDate;
		this.status = status;
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdAccept() {
		return adAccept;
	}

	public void setAdAccept(String adAccept) {
		this.adAccept = adAccept;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", email=" + email
				+ ", rrn=" + rrn + ", phone=" + phone + ", address=" + address + ", adAccept=" + adAccept
				+ ", enrollDate=" + enrollDate + ", status=" + status + "]";
	}
	
	
}
