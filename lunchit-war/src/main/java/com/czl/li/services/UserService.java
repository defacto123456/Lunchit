package com.czl.li.services;

public interface UserService {

	/**
	 * Check to see whether there is a corresponding user account in the system
	 * based on the email
	 * 
	 * @param email
	 * @param firstName
	 * @param lastName
	 */
	void verifyUserEmail(String email, String firstName, String lastName);

}
