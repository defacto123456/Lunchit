package com.czl.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * user data model class
 * 
 * @author Yunfei
 * 
 */
@Entity
@Table(name = "user", catalog = "lunchIt")
public class User {
	@Id
	@Column(name = "user_id", nullable = false)
	private double userId;

	@Column(name = "first_name", nullable = true)
	private String firstName;

	@Column(name = "last_name", nullable = true)
	private String lastName;

	@Column(name = "facebook_email", nullable = false)
	private String fbEmail;

	public double getUserId() {
		return userId;
	}

	public void setUserId(double _userId) {
		userId = _userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String _firstName) {
		firstName = _firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String _lastName) {
		lastName = _lastName;
	}

	public String getFbEmail() {
		return fbEmail;
	}

	public void setFbEmail(String _fbEmail) {
		fbEmail = _fbEmail;
	}
}
