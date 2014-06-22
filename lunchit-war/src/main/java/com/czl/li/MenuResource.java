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

import com.czl.data.model.Menu;
import com.czl.li.services.MenuService;

/**
 * The web resources for the Menu
 * 
 * @author defacto
 * 
 */
@Component("menuResource")
@Path("/json/menu")
public class MenuResource {
	@Autowired
	@Qualifier(value = "menuService")
	private MenuService menuService;

	/**
	 * Get a list of menu for a given restaurant.
	 * 
	 * @param uriInfo
	 *            the uri that has the restaurant id. Not null.
	 * @return a list of menu or null if not available
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenuInJson(@Context final UriInfo uriInfo) {
		assert uriInfo != null;
		final MultivaluedMap<String, String> queryParams = uriInfo
				.getQueryParameters();

		if (queryParams == null) {
			return null;
		}
		final String restaurantId = queryParams.getFirst("restaurantid");

		if (restaurantId == null) {
			return null;
		}
		
		try
		{
			final int id = Integer.parseInt(restaurantId);
			return menuService.getMenuByRestaurant(id);
		}
		catch(final Throwable t)
		{
			System.out.println("Invalid id");
			return null;
		}
	}
}
