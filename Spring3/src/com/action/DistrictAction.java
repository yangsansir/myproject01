package com.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.ws.Action;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.json.annotations.JSON;

import com.entities.District;
import com.entities.Employee;
import com.entities.MiddleFloor;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DistrictService;

@SuppressWarnings("serial")
public class DistrictAction extends ActionSupport  implements SessionAware{
 private Integer id;
 private Map<String,Object> session;
 private District district;
 private List<MiddleFloor> middleFloor;
 private DistrictService districtService;
 private int currentPage;
 private int totalPage;
 private int totalSize;
 private int pageSize=4;

private List<MiddleFloor> middleFloors=new ArrayList<MiddleFloor>();
 public String addDistrict(){
	 districtService.addDistrict(district, middleFloor);
	return "success"; 
 } 
 @JSON
 public String findByDistrictId(){
	 middleFloors= districtService.findByDistrictId(id);
	 System.out.println(middleFloors.get(0).getBuildNUmber());
	 return SUCCESS;
 }
 public String  findAll(){
		if(currentPage==0){
			   currentPage = 1;
			  }
		 totalSize=districtService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;
		List<District> districtlist=districtService.getAllDistrict(currentPage, pageSize);
		session.put("districtlist", districtlist);
		return "success";
	}
 public String delete(){
	 district=districtService.findById(id);
	 districtService.delete(district);
		return "success";
		
	}
	public String update(){
		districtService.update(district);
		return "success";
		
	}
	public String findById(){
		district=districtService.findById(id);
		return "success";
		
	}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
}
public List<MiddleFloor> getMiddleFloor() {
	return middleFloor;
}
public void setMiddleFloor(List<MiddleFloor> middleFloor) {
	this.middleFloor = middleFloor;
}
public DistrictService getDistrictService() {
	return districtService;
}
public void setDistrictService(DistrictService districtService) {
	this.districtService = districtService;
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
public List<MiddleFloor> getMiddleFloors() {
	return middleFloors;
}
public void setMiddleFloors(List<MiddleFloor> middleFloors) {
	this.middleFloors = middleFloors;
}




 
}
