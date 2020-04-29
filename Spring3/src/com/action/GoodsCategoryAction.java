package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.GoodsCategory;
import com.entities.GoodsType;
import com.service.GoodsCategoryService;
import com.service.GoodsTypeService;

public class GoodsCategoryAction implements SessionAware {
private Integer id;
private GoodsCategory goodsCategory;
private GoodsCategoryService goodsCategoryService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;

private Map<String, Object> session;
public String add(){
	goodsCategoryService.add(goodsCategory);
	return "success";
	
}
public  String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=goodsCategoryService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<GoodsCategory> GoodsCategory=goodsCategoryService.findAll(currentPage, pageSize);
	session.put("goodsCategorylist", GoodsCategory);
	return "success";
	
}
public String findById(){
	goodsCategory=goodsCategoryService.findById(id);
	return "success";
}
public String delete(){
	goodsCategory=goodsCategoryService.findById(id);
	goodsCategoryService.delete(goodsCategory);
	return "success";
}
public String update(){
	goodsCategoryService.update(goodsCategory);
	return "success";
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public GoodsCategory getGoodsCategory() {
	return goodsCategory;
}
public void setGoodsCategory(GoodsCategory goodsCategory) {
	this.goodsCategory = goodsCategory;
}

public GoodsCategoryService getGoodsCategoryService() {
	return goodsCategoryService;
}
public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
	this.goodsCategoryService = goodsCategoryService;
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
