package au.edu.unsw.soacourse.foundit.bean;

import au.edu.unsw.soacourse.foundit.model.User;

public class Register extends User{

	private String confirmPassword;
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
