package com.czl.li.services;

import java.util.List;

import com.czl.li.data.model.Order;

public interface OrderService {

	List<Order> getOrdersByUser(int userId);

}
