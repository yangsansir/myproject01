package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CostType;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;
import com.service.HouseHoldBillService;

public class HouseHoldBillAction implements SessionAware {
private Integer id;
private Map<String, Object> session;
private HouseHoldBill houseHoldBill;
private SinglePayment singlePayment;
private CostType costType;
private HouseHoldBillService houseHoldBillService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String addHouseHoldBill(){
	
	houseHoldBillService.addHouseHoldBill(houseHoldBill, singlePayment);
	return "success";
	 
}
public String SelectAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=houseHoldBillService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<HouseHoldBill> houseHoldBillList=	houseHoldBillService.findAll(currentPage, pageSize);
	session.put("houseHoldBillList", houseHoldBillList);
	
	return "success";
	
}
public String update(){
	
	houseHoldBillService.update(houseHoldBill, singlePayment);
	return "success"; 
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public HouseHoldBill getHouseHoldBill() {
	return houseHoldBill;
}
public void setHouseHoldBill(HouseHoldBill houseHoldBill) {
	this.houseHoldBill = houseHoldBill;
}




public SinglePayment getSinglePayment() {
	return singlePayment;
}
public void setSinglePayment(SinglePayment singlePayment) {
	this.singlePayment = singlePayment;
}
public CostType getCostType() {
	return costType;
}
public void setCostType(CostType costType) {
	this.costType = costType;
}
public HouseHoldBillService getHouseHoldBillService() {
	return houseHoldBillService;
}
public void setHouseHoldBillService(HouseHoldBillService houseHoldBillService) {
	this.houseHoldBillService = houseHoldBillService;
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
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





}
