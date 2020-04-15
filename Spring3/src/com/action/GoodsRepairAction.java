package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.GoodsRepair;
import com.service.GoodsRepairService;

public class GoodsRepairAction implements SessionAware {
private Integer id;
private Map<String, Object> session;
private GoodsRepair goodsRepair;
private GoodsRepairService goodsRepairService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
public String add(){
	goodsRepairService.add(goodsRepair);
	return "success";
}
public  String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=goodsRepairService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<GoodsRepair> goodsRepairlist=goodsRepairService.findAll(currentPage, pageSize);
	session.put("goodsRepairlist", goodsRepairlist);
	return "success";
	
}
public String findById(){
	goodsRepair=goodsRepairService.findById(id);
	return "success";
}
public String delete(){
	goodsRepair=goodsRepairService.findById(id);
	goodsRepairService.delete(goodsRepair);
	return "success";
}
public String update(){
	goodsRepairService.update(goodsRepair);
	return "success";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public GoodsRepair getGoodsRepair() {
	return goodsRepair;
}
public void setGoodsRepair(GoodsRepair goodsRepair) {
	this.goodsRepair = goodsRepair;
}
public GoodsRepairService getGoodsRepairService() {
	return goodsRepairService;
}
public void setGoodsRepairService(GoodsRepairService goodsRepairService) {
	this.goodsRepairService = goodsRepairService;
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
