package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;





import com.entities.Residernt;
import com.entities.ReturnBill;
import com.service.CheckUserService;
import com.service.ReturnBillService;



public class ReturnBillAction implements SessionAware{
private Integer id;
private ReturnBill returnBill;
private ReturnBillService returnBillService ;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String add(){
	
	
	returnBillService.addreturnBill(returnBill);
	return "success";
	
}
public String delete(){
	returnBill=returnBillService.findById(id);
	returnBillService.deletereturnBill(returnBill);
	return "success";
	
}
public String update(){
	returnBillService.updatereturnBill(returnBill);
	return "success";
	
}
public String findById(){
	returnBill=returnBillService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=returnBillService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<ReturnBill>	returnBilllist=returnBillService.findAll(currentPage, pageSize);
	session.put("returnBilllist", returnBilllist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


public ReturnBill getReturnBill() {
	return returnBill;
}
public void setReturnBill(ReturnBill returnBill) {
	this.returnBill = returnBill;
}
public ReturnBillService getReturnBillService() {
	return returnBillService;
}
public void setReturnBillService(ReturnBillService returnBillService) {
	this.returnBillService = returnBillService;
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

}
