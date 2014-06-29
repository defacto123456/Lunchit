package com.czl.li.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * menu data model class
 * 
 * @author Yunfei
 * 
 */
@Entity
@Table(name = "menu", catalog = "lunchIt")
public class Menu {

	@Id
	@Column(name = "menu_id", nullable = false)
	private int menuId;

	@Column(name = "menu_name", nullable = false)
	private String menuName;

	@Column(name = "menu_detail", nullable = false)
	private String menuDetail;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	@Column(name = "menu_price", nullable = false)
	private double menuPrice;

	@Column(name = "menu_availability", nullable = true)
	private boolean menuAvailability;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int _menuId) {
		menuId = _menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String _menuName) {
		menuName = _menuName;
	}

	public String getMenuDetail() {
		return menuDetail;
	}

	public void setMenuDetail(String _menuDetail) {
		menuDetail = _menuDetail;
	}

	public Restaurant getResturant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant _restaurant) {
		restaurant = _restaurant;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double _menuPrice) {
		menuPrice = _menuPrice;
	}

	public boolean getMenuAvailability() {
		return menuAvailability;
	}

	public void setMenuPrice(boolean _menuAvailability) {
		menuAvailability = _menuAvailability;
	}
}
