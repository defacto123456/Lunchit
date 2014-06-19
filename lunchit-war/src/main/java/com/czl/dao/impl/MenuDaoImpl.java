package com.czl.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.czl.dao.MenuDao;
import com.czl.data.model.Menu;

/**
 * Menu data access implementation
 * 
 * @author Yunfei
 * 
 */
public class MenuDaoImpl implements MenuDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public Menu getMenuByMenuId(double _menuId) {
		return entityManager.find(Menu.class, _menuId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createMenu(Menu _menu) {
		entityManager.persist(_menu);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeMenuByMenuId(double _menuId) {
		entityManager.remove(getMenuByMenuId(_menuId));
	}

}
