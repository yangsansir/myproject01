package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;







import com.entities.Goods;
import com.entities.GoodsCategory;
import com.entities.Residernt;
import com.service.CheckUserService;
import com.service.GoodsCategoryService;
import com.service.GoodsService;



public class GoodsAction implements SessionAware{
private Integer id;
private Goods goods;
private GoodsService goodsService ;
private Map<String, Object> session;
private GoodsCategoryService goodsCategoryService;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
private String keyword;
public String add(){
	List<GoodsCategory> GoodsCategory=goodsCategoryService.findAll(currentPage, pageSize);
	session.put("goodsCategorylist", GoodsCategory);
	
	return "success";
	
}
public String addgoods(){
	goodsService.addgoods(goods);
	return "success";
	
}
public String delete(){
	goods=goodsService.findById(id);
	goodsService.deletegoods(goods);
	return "success";
	
}
public String update(){
	goodsService.updategoods(goods);
	return "success";
	
}
public String findById(){
	goods=goodsService.findById(id);
	return "success";
	
}
public String query(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=goodsService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Goods>	goodslist1=goodsService.query(currentPage, pageSize,keyword);
	System.out.println(goodslist1);
	session.put("goodslist1", goodslist1);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=goodsService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Goods>	goodslist=goodsService.findAll(currentPage, pageSize);
	session.put("goodslist", goodslist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
}
public Residernt getResidernt() {
	return residernt;
}
public void setResidernt(Residernt residernt) {
	this.residernt = residernt;
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
public Goods getGoods() {
	return goods;
}
public void setGoods(Goods goods) {
	this.goods = goods;
}
public GoodsService getGoodsService() {
	return goodsService;
}
public void setGoodsService(GoodsService goodsService) {
	this.goodsService = goodsService;
}
public GoodsCategoryService getGoodsCategoryService() {
	return goodsCategoryService;
}
public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
	this.goodsCategoryService = goodsCategoryService;
}
public String getKeyword() {
	return keyword;
}
public void setKeyword(String keyword) {
	this.keyword = keyword;
}

}
