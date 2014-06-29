package com.czl.li.services;

import java.util.List;
import java.util.Map;

import com.czl.li.data.model.Menu;
import com.czl.li.data.model.Restaurant;

/**
 * The Menu service with all the related business logic
 * 
 * @author defacto
 * 
 */
public interface MenuService {

	/**
	 * Get all the menus for all the restaurants.
	 * 
	 * @return all menus for all restaurants as a map. The key of each entry is
	 *         the restaurant. The value is a list of menu. It could be null if
	 *         not available.
	 */
	public Map<Restaurant, List<Menu>> getAllMenuForAllRestaurant();

}
