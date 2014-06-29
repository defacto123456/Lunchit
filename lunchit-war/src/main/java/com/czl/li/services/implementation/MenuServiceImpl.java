package com.czl.li.services.implementation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.czl.dao.MenuDao;
import com.czl.dao.RestaurantDao;
import com.czl.data.model.Menu;
import com.czl.data.model.Restaurant;
import com.czl.li.services.MenuService;

/**
 * The implementation of the Menu service
 * 
 * @author defacto
 * 
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	@Qualifier("menuDao")
	private MenuDao menuDao;

	@Autowired
	@Qualifier("restaurantDao")
	private RestaurantDao restaurantDao;

	/**
	 * Get all menus for all restaurants
	 * 
	 * @return all menus for all restaurants as a map. The key of each entry is
	 *         the restaurant. The value is a list of menu. It could be null if
	 *         not available.
	 */
	public Map<Restaurant, List<Menu>> getAllMenuForAllRestaurant() {
		// TODO Auto-generated method stub
		return null;
	}

}
