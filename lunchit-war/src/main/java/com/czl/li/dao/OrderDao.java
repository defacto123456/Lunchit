package com.czl.li.dao;

import java.util.List;

import com.czl.li.data.model.Order;
import com.czl.li.data.model.User;

/**
 * order data access interface
 * 
 * @author Yunfei
 * 
 */
public interface OrderDao {
	/**
	 * get {@link Order} by orderId
	 * 
	 * @return {@link Order}
	 */
	public Order getOrderByOrderId(int _orderId);

	/**
	 * create a {@link Order}
	 * 
	 * @param _order
	 *            the specific {@link Order} needs to be created.
	 */
	public void createOrder(Order _order);

	/**
	 * remove a {@link Order}
	 * 
	 * @param _orderId
	 *            the id of specified {@link Order} needs to be removed.
	 */
	public void removeOrderByOrderId(int _orderId);

	/**
	 * get all orders for specific user.
	 * 
	 * @param _user
	 * @return a list of order belongs to one user
	 */
	public List<Order> getAllOrderByUserId(User _user);
}
