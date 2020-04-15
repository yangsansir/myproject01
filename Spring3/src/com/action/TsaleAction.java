package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;





import com.entities.Residernt;
import com.entities.Tsale;
import com.service.CheckUserService;
import com.service.TsaleService;



public class TsaleAction implements SessionAware{
private Integer id;
private Tsale tsale;
private TsaleService tsaleService ;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String add(){
	
	
	tsaleService.addtsale(tsale);
	return "success";
	
}
public String delete(){
	tsale=tsaleService.findById(id);
	tsaleService.deletetsale(tsale);
	return "success";
	
}
public String update(){
	tsaleService.updatetsale(tsale);
	return "success";
	
}
public String findById(){
	tsale=tsaleService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=tsaleService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Tsale>	tsalelist=tsaleService.findAll(currentPage, pageSize);
	session.put("tsalelist", tsalelist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


public Tsale getTsale() {
	return tsale;
}
public void setTsale(Tsale tsale) {
	this.tsale = tsale;
}
public TsaleService getTsaleService() {
	return tsaleService;
}
public void setTsaleService(TsaleService tsaleService) {
	this.tsaleService = tsaleService;
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
