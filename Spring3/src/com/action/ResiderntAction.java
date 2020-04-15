package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CostType;
import com.entities.District;
import com.entities.MiddleFloor;
import com.entities.Residernt;
import com.service.CostTypeService;
import com.service.DistrictService;
import com.service.ResiderntService;

public class ResiderntAction implements SessionAware {
private Integer id;
private Map<String, Object> session;
private Residernt residernt;
private List<CostType> costType;
private CostTypeService costTypeService;
private District district;
private MiddleFloor middleFloor;
private DistrictService districtService;
private  ResiderntService residerntService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
public String addResidernt(){
	residerntService.addresidernt(residernt);
	return "success";
}
public String update(){
	residerntService.updateResidernt(residernt);
	return "success";
	
}
public String delete(){
	residerntService.delete(residernt);
	return "success";
	
}
public String findById(){
	residernt=residerntService.findById(id);
	List<District>  districtlist= districtService.getAllDistrict(currentPage, pageSize);
	 session.put("districtlist", districtlist);
	 List<CostType> costTypelist=costTypeService.findAll(currentPage, pageSize);
		session.put("costTypelist", costTypelist);
	return "success";
	
}
public String SelectAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
		  totalSize=residerntService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else
		    totalPage = totalSize/pageSize+1;
	List<Residernt> residerntlist=residerntService.fingAll(currentPage, pageSize);
	session.put("residerntlist", residerntlist);
	return "success";
	
}
public String SelectAllDistrict(){
	 List<District>  districtlist= districtService.getAllDistrict(currentPage, pageSize);
	 session.put("districtlist", districtlist);
	return "success";
	 
}
public String login(){
	residernt=residerntService.login(residernt.getLoginName(),residernt.getPassword());
	if(residernt!=null){
		session.put("RealName", residernt.getRealName());
		session.put("id", residernt.getId());
		session.put("login",residernt);
		return "success";
	}
	return "error";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Residernt getResidernt() {
	return residernt;
}
public void setResidernt(Residernt residernt) {
	this.residernt = residernt;
}
public ResiderntService getResiderntService() {
	return residerntService;
}
public void setResiderntService(ResiderntService residerntService) {
	this.residerntService = residerntService;
}
public MiddleFloor getMiddleFloor() {
	return middleFloor;
}
public void setMiddleFloor(MiddleFloor middleFloor) {
	this.middleFloor = middleFloor;
}
public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
	
}
public DistrictService getDistrictService() {
	return districtService;
}
public void setDistrictService(DistrictService districtService) {
	this.districtService = districtService;
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
