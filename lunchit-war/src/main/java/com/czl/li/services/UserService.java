package com.czl.li.services;

public interface UserService {

	/**
	 * Check to see whether there is a corresponding user account in the system
	 * based on the email
	 * 
	 * @param email
	 */
	void verifyUserEmail(String email);

}
