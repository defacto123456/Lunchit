package com.czl.li.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.czl.li.dao.OrderDao;
import com.czl.li.data.model.Order;
import com.czl.li.data.model.User;

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
	public Order getOrderByOrderId(int _orderId) {
		return entityManager.find(Order.class, _orderId);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createOrder(Order _order) {
		entityManager.persist(_order);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeOrderByOrderId(int _orderId) {
		entityManager.remove(getOrderByOrderId(_orderId));
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Order> getAllOrderByUserId(User _user) {
		Query query = entityManager.createQuery("select order from Order order where order.user=:user");
		query.setParameter("user", _user);
		return query.getResultList();
	}

}
