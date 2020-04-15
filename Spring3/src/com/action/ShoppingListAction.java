package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.ShoppingList;
import com.service.ShoppingListService;

public class ShoppingListAction implements SessionAware{
private Integer id;
private ShoppingList shoppingList;
private ShoppingListService shoppingListService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
private Map<String, Object> session;
public String add(){
	shoppingListService.add(shoppingList);
	return "success";
	
}
public  String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=shoppingListService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<ShoppingList> shoppinglist=shoppingListService.findAll(currentPage, pageSize);
	session.put("shoppinglist", shoppinglist);
	return "success";
	
}
public String findById(){
	shoppingList=shoppingListService.findById(id);
	return "success";
}
public String delete(){
	shoppingList=shoppingListService.findById(id);
	shoppingListService.delete(shoppingList);
	return "success";
}
public String update(){
	shoppingListService.update(shoppingList);
	return "success";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public ShoppingList getShoppingList() {
	return shoppingList;
}
public void setShoppingList(ShoppingList shoppingList) {
	this.shoppingList = shoppingList;
}
public ShoppingListService getShoppingListService() {
	return shoppingListService;
}
public void setShoppingListService(ShoppingListService shoppingListService) {
	this.shoppingListService = shoppingListService;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public int getTotalSize() {
	return totalSize;
}
public void setTotalSize(int totalSize) {
	this.totalSize = totalSize;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
}

}
