package com.czl.dao.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.czl.dao.OrderDao;
import com.czl.data.model.Order;

/**
 * order data access implementation
 * 
 * @author Yunfei
 * 
 */
@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * {@inheritDoc}
	 */
	public Order getOrderByOrderId(double _orderId) {
		return entityManager.find(Order.class, _orderId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createOrder(com.czl.data.model.Order _order) {
		entityManager.persist(_order);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeUserByOrderId(double _orderId) {
		entityManager.remove(getOrderByOrderId(_orderId));
	}

}
