package com.czl.li.dao.impl.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czl.li.dao.UserDao;
import com.czl.li.data.model.User;

@RunWith(JUnit4.class)
public class UserDaoTest {
	private static final String FIRST_NAME = "Test";
	private static final String LAST_NAME = "Test";
	private static final String FB_EMAIL = "test@facebook.com";
	private User user;

	private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"/META-INF/applicationContext.xml");

	private UserDao userDao;

	@Before
	public void prepareTestData() {
		user = new User();
		userDao = (UserDao) applicationContext.getBean("userDao");
	}

	@After
	public void cleanupTestData() {
		user = null;
		userDao = null;
	}

	@Test
	public void testGetUserById() {
		final int userId = 0;
		user.setFbEmail(FB_EMAIL);
		user.setFirstName(FIRST_NAME);
		user.setLastName(LAST_NAME);
		user.setUserId(userId);

		// make sure userId is available
		if (userDao.getUserByUserId(userId) != null) {
			userDao.removeUserByUserId(userId);
		}

		userDao.createUser(user);
		final User newUser = userDao.getUserByUserId(user.getUserId());
		Assert.assertEquals(newUser.getFbEmail(), user.getFbEmail());
		userDao.removeUserByUserId(user.getUserId());
	}
}
