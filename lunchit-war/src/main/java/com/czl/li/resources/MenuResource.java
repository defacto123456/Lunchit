package com.czl.li.resources;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.czl.data.model.Menu;
import com.czl.data.model.Restaurant;
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
	 * Get all menus for all restaurants
	 * 
	 * @return all menus for all restaurants as a map. The key of each entry is
	 *         the restaurant. The value is a list of menu. It could be null if
	 *         not available.
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<Restaurant, List<Menu>> getMenuInJson() {
		return menuService.getAllMenuForAllRestaurant();
	}
}
