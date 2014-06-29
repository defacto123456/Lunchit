package com.czl.li.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.czl.li.data.model.Restaurant;
import com.czl.li.services.RestaurantService;

/**
 * The web resource for restaurant
 * 
 * @author defacto
 * 
 */
@Component("restaurantResource")
@Path("/json/restaurant")
public class RestaurantResource {
	@Autowired
	@Qualifier(value = "restaurantService")
	private RestaurantService restaurantService;

	/**
	 * Get all the restaurants
	 * 
	 * @return a list of all the restaurants. It should not be null.
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Restaurant> getRestaurantInJson() {
		final List<Restaurant> result = new ArrayList<Restaurant>();
		final List<Restaurant> temp = restaurantService.getAllRestaurants();

		if (temp != null) {
			result.addAll(temp);
		}
		return result;
	}
}
