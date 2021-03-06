package com.czl.li.dao;

import java.util.List;

import com.czl.li.data.model.Restaurant;

/**
 * restaurant data access interface
 * 
 * @author Yunfei
 * 
 */
public interface RestaurantDao {

	/**
	 * get {@link Restaurant} by restaurant Id
	 * 
	 * @param _restaurantId
	 *            restaurant Id
	 * @return the {@link Restaurant} specified by _restaurantId
	 */
	public Restaurant getRestaurantById(int _restaurantId);

	/**
	 * create a {@link Restaurant}
	 * 
	 * @param _restaurant
	 *            the specific {@link Restaurant} needs to be created
	 */
	public void createRestaurant(Restaurant _restaurant);

	/**
	 * remove a {@link Restaurant}
	 * 
	 * @param _restuarantId
	 *            the id of specified {@link Restaurant} needs to be removed.
	 */
	public void removeRestaurantById(int _restaurantId);

	/**
	 * get all resaurants.
	 * 
	 * @return List of all restaurants
	 */
	public List<Restaurant> getAllRestaurants();
}
