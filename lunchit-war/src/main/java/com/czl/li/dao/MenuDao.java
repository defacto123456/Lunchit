package com.czl.li.dao;

import java.util.List;

import com.czl.li.data.model.Menu;
import com.czl.li.data.model.Restaurant;

/**
 * Menu data access interface
 * 
 * @author Yunfei
 * 
 */
public interface MenuDao {
	/**
	 * get {@link Menu} by menuId
	 * 
	 * @return {@link Menu}
	 */
	public Menu getMenuByMenuId(int _menuId);

	/**
	 * create a {@link Menu}
	 * 
	 * @param _menu
	 *            the specific {@link Menu} needs to be created.
	 */
	public void createMenu(Menu _menu);

	/**
	 * remove a {@link Menu}
	 * 
	 * @param _menuId
	 *            the id of specified {@link Menu} needs to be removed.
	 */
	public void removeMenuByMenuId(int _menuId);

	/**
	 * get all menus for one restaurant
	 * 
	 * @param _restaurant
	 * @return a list of menus for the specific restaurant
	 */
	public List<Menu> getAllMenuByRestaurant(Restaurant _restaurant);
}
