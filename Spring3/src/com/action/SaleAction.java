package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;








import com.entities.Residernt;
import com.entities.Sale;
import com.service.CheckUserService;
import com.service.SaleService;



public class SaleAction implements SessionAware{
private Integer id;
private Sale sale;
private SaleService saleService ;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
private double totle;
private double price;
private String begindate;
private String enddate;
public String add(){
	Date date=new Date();

	saleService.addsale(sale);
	return "success";
	
}
public String delete(){
	sale=saleService.findById(id);
	saleService.deletesale(sale);
	return "success";
	
}
public String update(){
	saleService.updatesale(sale);
	return "success";
	
}
public String findById(){
	sale=saleService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=saleService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	  totle= saleService.totleprice();
	List<Sale>	salelist=saleService.findAll(currentPage, pageSize);

	session.put("salelist", salelist);
	session.put("totle", totle);
	return "success";
	
}
public String query(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=saleService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Sale>	salelist=saleService.findAll(currentPage, pageSize);
	session.put("salelist", salelist);
	price=saleService.query(begindate, enddate);
	session.put("price", price);
	return "success";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


public Sale getSale() {
	return sale;
}
public void setSale(Sale sale) {
	this.sale = sale;
}
public SaleService getSaleService() {
	return saleService;
}
public void setSaleService(SaleService saleService) {
	this.saleService = saleService;
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
public double getTotle() {
	return totle;
}
public void setTotle(double totle) {
	this.totle = totle;
}
public String getBegindate() {
	return begindate;
}
public void setBegindate(String begindate) {
	this.begindate = begindate;
}
public String getEnddate() {
	return enddate;
}
public void setEnddate(String enddate) {
	this.enddate = enddate;
}

}
