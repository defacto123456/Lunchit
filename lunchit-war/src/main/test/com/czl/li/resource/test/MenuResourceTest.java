package com.czl.li.resource.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czl.li.data.model.Menu;
import com.czl.li.data.model.Restaurant;
import com.czl.li.resources.MenuResource;

@RunWith(JUnit4.class)
public class MenuResourceTest {

	private MenuResource menuResource;

	private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"/META-INF/applicationContext.xml");

	@Before
	public void prepareTestData() {

	}

	/**
	 * Get all menus for all restaurants
	 */
	@Test
	public void testGetMenuInJson() {
		menuResource = (MenuResource) applicationContext
				.getBean("menuResource");
		final Map<Restaurant, List<Menu>> menuRestaurantMap = menuResource
				.getMenuInJson();
		for (final Entry<Restaurant, List<Menu>> entry : menuRestaurantMap
				.entrySet()) {
			final Restaurant restaurant = entry.getKey();

			Assert.assertNotNull(restaurant);
			System.out
					.println("Restaurant = " + restaurant.getRestaurantName());

			for (final Menu menu : entry.getValue()) {
				Assert.assertNotNull(menu);
				System.out.println("\tMenu = " + menu.getMenuName());
			}
		}
	}

	@After
	public void cleanupTestData() {

	}
}
