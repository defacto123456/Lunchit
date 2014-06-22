package com.czl.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.czl.dao.RestaurantDao;
import com.czl.data.model.Restaurant;

/**
 * restaurant data access implementation
 * 
 * @author Yunfei
 * 
 */
@Repository("restaurantDao")
public class RestaurantDaoImpl implements RestaurantDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public Restaurant getRestaurantById(int _restaurantId) {
		return entityManager.find(Restaurant.class, _restaurantId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createRestaurant(Restaurant _restaurant) {
		entityManager.persist(_restaurant);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeRestaurantById(int _restaurantId) {
		entityManager.remove(getRestaurantById(_restaurantId));
	}

}
