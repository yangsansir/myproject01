package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.entities.CheckUser;
import com.entities.Residernt;
import com.service.CheckUserService;


public class CheckUserAction implements SessionAware{
private Integer id;
private CheckUser checkUser;
private CheckUserService checkUserService;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String add(){
	checkUserService.addcheckUser(checkUser);
	return "success";
	
}
public String delete(){
	checkUser=checkUserService.findById(id);
	checkUserService.deletecheckUser(checkUser);
	return "success";
	
}
public String update(){
	checkUserService.updatecheckUser(checkUser);
	return "success";
	
}
public String findById(){
	checkUser=checkUserService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=checkUserService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
	session.put("checkUserlist", checkUserlist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public CheckUser getCheckUser() {
	return checkUser;
}
public void setCheckUser(CheckUser checkUser) {
	this.checkUser = checkUser;
}
public CheckUserService getCheckUserService() {
	return checkUserService;
}
public void setCheckUserService(CheckUserService checkUserService) {
	this.checkUserService = checkUserService;
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
