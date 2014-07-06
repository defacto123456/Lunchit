package com.czl.li.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.czl.li.data.model.Menu;
import com.czl.li.data.model.Restaurant;
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
//	public List<Menu> getMenuInJson() {
		System.out.println("111111");

//		List<Menu> menus = new ArrayList<Menu>();
		return menuService.getAllMenuForAllRestaurant();
		
		
		
//		 Map<Restaurant, List<Menu>> a = menuService.getAllMenuForAllRestaurant();
//		 Iterator it = a.entrySet().iterator();
//		 while (it.hasNext()) {
//		        Map.Entry pairs = (Map.Entry)it.next();
//		        System.out.println(pairs.getKey() + " = " + pairs.getValue());
//		        
//		        List<Menu> m = (List<Menu>) pairs.getValue();
//		        menus.addAll(m);
//		        
//		        it.remove(); // avoids a ConcurrentModificationException
//		        
//		 }
//		 return menus;
		 
		 
		 
	}
}
