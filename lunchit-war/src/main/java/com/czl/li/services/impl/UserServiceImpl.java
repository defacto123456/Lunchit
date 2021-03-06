package com.czl.li.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.czl.li.dao.UserDao;
import com.czl.li.data.model.User;
import com.czl.li.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	public void verifyUserEmail(final String email, final String firstName,
			final String lastName) {

		if (!userDao.isUserExisted(email)) {
			// create new user
			final User user = new User();
			// TODO user id?
			user.setFbEmail(email);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			System.out.println("Create a new user for " + email);
			userDao.createUser(user);
		}
	}

}
