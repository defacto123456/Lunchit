package com.czl.li.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.czl.li.dao.RestaurantDao;
import com.czl.li.data.model.Restaurant;

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

	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public Restaurant getRestaurantById(final int _restaurantId) {
		return entityManager.find(Restaurant.class, _restaurantId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createRestaurant(final Restaurant _restaurant) {
		entityManager.persist(_restaurant);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeRestaurantById(final int _restaurantId) {
		entityManager.remove(getRestaurantById(_restaurantId));
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Restaurant> getAllRestaurants() {
		final Query query = entityManager
				.createQuery("select restaurant from Restaurant restaurant");
		return query.getResultList();
	}

}
