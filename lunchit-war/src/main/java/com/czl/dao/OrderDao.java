package com.czl.dao;

import com.czl.data.model.Order;

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
	public Order getOrderByOrderId(double _orderId);

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
	public void removeUserByOrderId(double _orderId);
}
