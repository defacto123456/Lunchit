package com.czl.data.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Order data model class
 * 
 * @author Yunfei
 * 
 */
@Entity
@Table(name = "order", catalog = "lunchIt")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id", nullable = false)
	private int orderId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_id")
	private Menu menu;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "date_time", nullable = true)
	private Date dateTime;

	@Column(name = "comment", nullable = true)
	private String comment;

	@Column(name = "order_price", nullable = false)
	private double orderPrice;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int _orderId) {
		orderId = _orderId;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu _menu) {
		menu = _menu;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int _quantity) {
		quantity = _quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User _user) {
		user = _user;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date _dateTime) {
		dateTime = _dateTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String _comment) {
		comment = _comment;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double _orderPrice) {
		orderPrice = _orderPrice;
	}
}
