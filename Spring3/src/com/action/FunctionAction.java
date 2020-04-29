package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Function;
import com.entities.Role;
import com.service.FunctionService;
public class FunctionAction implements SessionAware {
private Integer id;
private Map<String, Object> session;
private Function function;
private Role role;
private FunctionService functionService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String addFunction(){
	functionService.addFunction(function);
	return "success";
	
}
public  String findALL(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=functionService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Function> functionlist=functionService.findAll(currentPage, pageSize);
	session.put("functionlist", functionlist);
	return "success";
	
}
public String findById(){
	function=functionService.findById(id);
	return "success";
}
public String delete(){
	function=functionService.findById(id);
	functionService.delete(function);
	return "success";
}
public String update(){
	functionService.update(function);
	return "success";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


public Function getFunction() {
	return function;
}
public void setFunction(Function function) {
	this.function = function;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public FunctionService getFunctionService() {
	return functionService;
}
public void setFunctionService(FunctionService functionService) {
	this.functionService = functionService;
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
