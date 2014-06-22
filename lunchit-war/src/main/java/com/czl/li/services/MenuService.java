package com.czl.li.services;

import java.util.List;

import com.czl.data.model.Menu;

/**
 * The Menu service with all the related business logic
 * 
 * @author defacto
 * 
 */
public interface MenuService {

	/**
	 * Get all the menus for a given restaurant
	 * 
	 * @param id
	 * @return
	 */
	public List<Menu> getMenuByRestaurant(int id);

}
