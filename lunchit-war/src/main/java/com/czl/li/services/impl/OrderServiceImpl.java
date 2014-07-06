package com.czl.li.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.czl.li.dao.OrderDao;
import com.czl.li.dao.UserDao;
import com.czl.li.data.model.Order;
import com.czl.li.data.model.User;
import com.czl.li.services.OrderService;

/**
 * Implementation of OrderService
 * 
 * @author Yunfei
 * 
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;

	public List<Order> getOrdersByUser(int userId) {
		User user = userDao.getUserByUserId(userId);
		return orderDao.getAllOrderByUserId(user);
	}

}
