package com.czl.li.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.czl.li.dao.MenuDao;
import com.czl.li.data.model.Menu;
import com.czl.li.data.model.Restaurant;

/**
 * Menu data access implementation
 * 
 * @author Yunfei
 * 
 */
@Repository("menuDao")
public class MenuDaoImpl implements MenuDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public Menu getMenuByMenuId(int _menuId) {
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
	public void removeMenuByMenuId(int _menuId) {
		entityManager.remove(getMenuByMenuId(_menuId));
	}

	public List<Menu> getAllMenuByRestaurant(Restaurant _restaurant) {
		Query query = entityManager.createQuery("select menu from Menu menu where menu.restaurant=:restaurant");
		query.setParameter("restaurant", _restaurant);
		return query.getResultList();
	}

}
