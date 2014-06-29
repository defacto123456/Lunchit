package com.czl.li.dao;

import com.czl.li.data.model.User;

/**
 * user data access interface
 * 
 * @author Yunfei
 * 
 */
public interface UserDao {
	/**
	 * get {@link User} by userId
	 * 
	 * @return {@link User}
	 */
	public User getUserByUserId(int _userId);

	/**
	 * helper method to indicate whether user existed in system or not.
	 * 
	 * @param _fbEmail
	 * @return boolean value indicates whether this user existed or not
	 */
	public boolean isUserExisted(String _fbEmail);

	/**
	 * create a {@link User}
	 * 
	 * @param _user
	 *            the specific {@link User} needs to be created.
	 */
	public void createUser(User _user);

	/**
	 * remove a {@link User}
	 * 
	 * @param _userId
	 *            the id of specified {@link User} needs to be removed.
	 */
	public void removeUserByUserId(int _userId);
}
