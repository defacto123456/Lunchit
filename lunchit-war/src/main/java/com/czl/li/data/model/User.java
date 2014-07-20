package com.czl.li.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * user data model class
 * 
 * @author Yunfei
 * 
 */
@Entity(name = "com.czl.li.data.model.User")
@Table(name = "user", catalog = "lunchIt")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "first_name", nullable = true)
	private String firstName;

	@Column(name = "last_name", nullable = true)
	private String lastName;

	@Column(name = "facebook_email", nullable = false)
	private String fbEmail;

	public int getUserId() {
		return userId;
	}

	public void setUserId(final int _userId) {
		userId = _userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String _firstName) {
		firstName = _firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String _lastName) {
		lastName = _lastName;
	}

	public String getFbEmail() {
		return fbEmail;
	}

	public void setFbEmail(final String _fbEmail) {
		fbEmail = _fbEmail;
	}
}
