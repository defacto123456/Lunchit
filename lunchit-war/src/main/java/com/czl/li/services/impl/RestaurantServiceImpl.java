package com.czl.li.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.czl.li.dao.RestaurantDao;
import com.czl.li.data.model.Restaurant;
import com.czl.li.services.RestaurantService;

/**
 * Implementation of RestaurantService
 * 
 * @author Yunfei
 * 
 */
@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	@Qualifier("restaurantDao")
	private RestaurantDao restaurantDao;

	public List<Restaurant> getAllRestaurants() {
		return restaurantDao.getAllRestaurants();
	}

}
