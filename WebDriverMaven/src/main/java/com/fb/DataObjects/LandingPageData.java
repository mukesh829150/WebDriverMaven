package com.fb.DataObjects;

public class LandingPageData {
	
	public String loginPassword;
	public String firstName;
	public String lastName;
	public String mobile;
	public String loginEmail;
	public String birthday;
	public String birthmonth;
	public String birthyear;
	
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setbirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
	}
	public void setbirthyear(String birthyear) {
		this.birthyear = birthyear;
	}

	

}
