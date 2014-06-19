package com.czl.dao;

import com.czl.data.model.Menu;

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
	public Menu getMenuByMenuId(double _menuId);

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
	public void removeMenuByMenuId(double _menuId);
}
