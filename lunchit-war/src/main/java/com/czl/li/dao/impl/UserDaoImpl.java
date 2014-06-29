package com.czl.li.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.czl.li.dao.UserDao;
import com.czl.li.data.model.User;

/**
 * user data access implementation
 * 
 * @author Yunfei
 * 
 */
@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public User getUserByUserId(int _userId) {
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
	public void removeUserByUserId(int _userId) {
		entityManager.remove(getUserByUserId(_userId));
	}

	public boolean isUserExisted(String _fbEmail) {
		Query query = entityManager
				.createQuery("select count(usr) from User usr where usr.fbEmail=:fbEmail");
		query.setParameter("fbEmail", _fbEmail);
		Long resultNumber = (Long) query.getSingleResult();

		return resultNumber.intValue() == 1;
	}

}
