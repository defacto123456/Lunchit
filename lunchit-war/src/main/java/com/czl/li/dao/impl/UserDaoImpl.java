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

	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public User getUserByUserId(final int _userId) {
		return entityManager.find(User.class, _userId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createUser(final User _user) {
		entityManager.persist(_user);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeUserByUserId(final int _userId) {
		entityManager.remove(getUserByUserId(_userId));
	}

	public boolean isUserExisted(final String _fbEmail) {
		final Query query = entityManager
				.createQuery("select count(usr) from com.czl.li.data.model.User usr where usr.fbEmail=:fbEmail");
		query.setParameter("fbEmail", _fbEmail);
		final Long resultNumber = (Long) query.getSingleResult();

		return resultNumber.intValue() == 1;
	}

}
