package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CostType;
import com.service.CostTypeService;

public class CostTypeAction implements SessionAware{
private Integer id;
private List<CostType> costType;
private CostType costType1;
private Map<String, Object> session;
private CostTypeService costTypeService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
public  String addcostType(){
	costTypeService.addCostType(costType);
	return "success";
	
}
public String SelectCostType(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=costTypeService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<CostType> costTypelist=costTypeService.findAll(currentPage, pageSize);
	session.put("costTypelist", costTypelist);
	return "success";
	
}
public String delete(){
	costType1=costTypeService.findById(id);
	costTypeService.delete(costType1);
	return "success";
	
}
public String update(){
	costTypeService.update(costType1);
	return "success";
	
}
public String findById(){
	costType1=costTypeService.findById(id);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public List<CostType> getCostType() {
	return costType;
}




public void setCostType(List<CostType> costType) {
	this.costType = costType;
}




public CostTypeService getCostTypeService() {
	return costTypeService;
}
public void setCostTypeService(CostTypeService costTypeService) {
	this.costTypeService = costTypeService;
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
public CostType getCostType1() {
	return costType1;
}
public void setCostType1(CostType costType1) {
	this.costType1 = costType1;
}

}
