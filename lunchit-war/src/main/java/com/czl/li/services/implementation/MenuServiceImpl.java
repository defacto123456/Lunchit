package com.czl.li.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.czl.dao.MenuDao;
import com.czl.data.model.Menu;
import com.czl.li.services.MenuService;

/**
 * The implementation of the Menu service
 * 
 * @author defacto
 * 
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	@Qualifier("menuDao")
	private MenuDao menuDao;

	public List<Menu> getMenuByRestaurant(final int id) {
		// TODO
		return null;
	}

}
