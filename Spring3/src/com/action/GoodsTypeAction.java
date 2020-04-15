package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.GoodsType;
import com.service.GoodsTypeService;

public class GoodsTypeAction implements SessionAware {
private Integer id;
private List<GoodsType> goodsType;
private GoodsType goodsType1;
private GoodsTypeService goodsTypeService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=3;
private Map<String, Object> session;
public String add(){
	goodsTypeService.add(goodsType);
	return "success";
	
}
public  String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=goodsTypeService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<GoodsType> goodsTypelist=goodsTypeService.findAll(currentPage, pageSize);
	session.put("goodsTypelist", goodsTypelist);
	return "success";
	
}
public String findById(){
	goodsType1=goodsTypeService.findById(id);
	return "success";
}
public String delete(){
	goodsType1=goodsTypeService.findById(id);
	goodsTypeService.delete(goodsType1);
	return "success";
}
public String update(){
	goodsTypeService.update(goodsType1);
	return "success";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public List<GoodsType> getGoodsType() {
	return goodsType;
}
public void setGoodsType(List<GoodsType> goodsType) {
	this.goodsType = goodsType;
}
public GoodsTypeService getGoodsTypeService() {
	return goodsTypeService;
}
public void setGoodsTypeService(GoodsTypeService goodsTypeService) {
	this.goodsTypeService = goodsTypeService;
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
public GoodsType getGoodsType1() {
	return goodsType1;
}
public void setGoodsType1(GoodsType goodsType1) {
	this.goodsType1 = goodsType1;
}

}
