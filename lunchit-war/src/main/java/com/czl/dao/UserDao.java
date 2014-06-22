package com.czl.dao;

import com.czl.data.model.User;

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
