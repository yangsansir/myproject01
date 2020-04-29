package com.service.impl;

import java.util.List;

import com.dao.ShoppingListDao;
import com.entities.ShoppingList;
import com.service.ShoppingListService;

public class ShoppingListServiceImpl implements ShoppingListService {
 private ShoppingListDao shoppingListDao;
	@Override
	public void add(ShoppingList shoppingList) {
		shoppingListDao.add(shoppingList);

	}
	@Override
	public List<ShoppingList> findAll(int currentPage, int pageSize) {
		List<ShoppingList> shoppinglist=shoppingListDao.findAll(currentPage, pageSize);
		return shoppinglist;
	}

	@Override
	public void delete(ShoppingList shoppingList) {
		shoppingListDao.delete(shoppingList);

	}

	@Override
	public ShoppingList findById(Integer id) {
		ShoppingList shoppingList=shoppingListDao.findById(id);
		return shoppingList;
	}

	@Override
	public void update(ShoppingList shoppingList) {
		shoppingListDao.update(shoppingList);

	}

	@Override
	public int getTotle() {
		
		return shoppingListDao.getTotle();
	}

	public ShoppingListDao getShoppingListDao() {
		return shoppingListDao;
	}

	public void setShoppingListDao(ShoppingListDao shoppingListDao) {
		this.shoppingListDao = shoppingListDao;
	}

}
