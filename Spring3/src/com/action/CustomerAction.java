package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.entities.Customer;
import com.entities.Residernt;
import com.service.CheckUserService;
import com.service.CustomerService;


public class CustomerAction implements SessionAware{
private Integer id;
private Customer customer;
private CustomerService customerService ;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String add(){
	
	
	customerService.addcustomer(customer);
	return "success";
	
}
public String delete(){
	customer=customerService.findById(id);
	customerService.deletecustomer(customer);
	return "success";
	
}
public String update(){
	customerService.updatecustomer(customer);
	return "success";
	
}
public String findById(){
	customer=customerService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=customerService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Customer>	customerlist=customerService.findAll(currentPage, pageSize);
	session.put("customerlist", customerlist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public CustomerService getCustomerService() {
	return customerService;
}
public void setCustomerService(CustomerService customerService) {
	this.customerService = customerService;
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
