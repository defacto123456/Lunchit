package com.czl.li.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * restaurant data model class
 * 
 * @author Yunfei
 * 
 */
@Entity(name = "com.czl.li.data.model.Restaurant")
@Table(name = "restaurant", catalog = "lunchIt")
public class Restaurant {
	@Id
	@Column(name = "restaurant_id", nullable = false)
	private int restaurantId;

	@Column(name = "restaurant_name", nullable = false)
	private String restaurantName;

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int _restaurantId) {
		restaurantId = _restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String _restaurantName) {
		restaurantName = _restaurantName;
	}
}
