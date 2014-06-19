package com.czl.data.model;

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
@Entity
@Table(name = "restaurant", catalog = "lunchIt")
public class Restaurant {
	@Id
	@Column(name = "restaurant_id", nullable = false)
	private double restaurantId;

	@Column(name = "restaurant_name", nullable = false)
	private String restaurantName;

	public double getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(double _restaurantId) {
		restaurantId = _restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String _restaurantName) {
		restaurantName = _restaurantName;
	}
}
