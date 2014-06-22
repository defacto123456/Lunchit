package com.czl.li;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.czl.data.model.Order;
import com.czl.li.services.OrderService;

/**
 * The web resource for orders
 * 
 * @author defacto
 * 
 */
@Component("orderResource")
@Path("/json/order")
public class OrderResource {
	@Autowired
	@Qualifier(value = "orderService")
	private OrderService orderService;

	/**
	 * Get all the orders of this user by user id
	 * 
	 * @param uriInfo
	 *            the uri with the user id which is a long string
	 * @return all the orders. It could be null if not available
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getAllOrdersByUserInJson(@Context final UriInfo uriInfo) {
		assert uriInfo != null;
		final MultivaluedMap<String, String> queryParams = uriInfo
				.getQueryParameters();

		if (queryParams == null) {
			return null;
		}
		final String userid = queryParams.getFirst("userid");

		if (userid == null) {
			return null;
		}

		return orderService.getOrdersByUser(userid);
	}
}
