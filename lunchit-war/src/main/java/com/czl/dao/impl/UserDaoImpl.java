package com.czl.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.czl.dao.UserDao;
import com.czl.data.model.User;

/**
 * user data access implementation
 * 
 * @author Yunfei
 * 
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public User getUserByUserId(double _userId) {
		return entityManager.find(User.class, _userId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createUser(User _user) {
		entityManager.persist(_user);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeUserByUserId(double _userId) {
		entityManager.remove(getUserByUserId(_userId));
	}

}
