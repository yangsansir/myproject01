package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Repair;
import com.entities.Residernt;
import com.entities.Salary;
import com.service.SalaryService;

public class SalaryAction implements SessionAware{
private Integer id;
private Salary salary;
private SalaryService salaryService;
private Map<String, Object> session;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
private Double totle;
public String add(){

	salaryService.addMessages(salary);
	return "success";	
}
public String delete(){
	salary=salaryService.findById(id);
	salaryService.deleteMessages(salary);
	return "success";
	
}
public String update(){
	salaryService.updateMessages(salary);
	return "success";
	
}
public String findById(){
	salary=salaryService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=salaryService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Salary> salarylist=salaryService.findAll(currentPage, pageSize);
	totle=salaryService.Totle();
	session.put("salarylist", salarylist);
	return "success";
	
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Salary getSalary() {
	return salary;
}
public void setSalary(Salary salary) {
	this.salary = salary;
}
public SalaryService getSalaryService() {
	return salaryService;
}
public void setSalaryService(SalaryService salaryService) {
	this.salaryService = salaryService;
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
public Double getTotle() {
	return totle;
}
public void setTotle(Double totle) {
	this.totle = totle;
}

}
