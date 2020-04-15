package com.dao;

import java.util.List;

import com.entities.ShoppingList;

public interface ShoppingListDao {
	public void add(ShoppingList shoppingList  );
	public List<ShoppingList> findAll(int currentPage,int pageSize);
	public void delete(ShoppingList shoppingList );
	public ShoppingList findById(Integer id);
	public void update(ShoppingList shoppingList );
	public int getTotle();
}
