package com.czl.li.services;

import java.util.List;

import com.czl.data.model.Order;

public interface OrderService {

	List<Order> getOrdersByUser(String userid);

}
