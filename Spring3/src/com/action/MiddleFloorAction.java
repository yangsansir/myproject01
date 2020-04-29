package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.District;
import com.entities.MiddleFloor;
import com.entities.Residernt;
import com.service.DistrictService;
import com.service.MiddleFloorService;

public class MiddleFloorAction implements SessionAware{
private int id;
private MiddleFloorService middleFloorService;
private MiddleFloor middleFloor;
private Map<String, Object> session;
private Residernt residernt;
private District district;
private DistrictService districtService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
public String add(){
	middleFloorService.add(middleFloor);
	return "success";
	
}
public String delete(){
	middleFloor=middleFloorService.findById(id);
	middleFloorService.delete(middleFloor);
	return "success";
	
}
public String update(){
	middleFloorService.update(middleFloor);
	return "success";
	
}
public String findById(){
	List<District> districtlist=districtService.getAllDistrict(currentPage, pageSize);
	session.put("districtlist", districtlist);
	middleFloor=middleFloorService.findById(id);
	return "success";
	
}
public String findAll(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=middleFloorService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<MiddleFloor>	middleFloorlist=middleFloorService.findAll(currentPage, pageSize);
	session.put("middleFloorlist", middleFloorlist);
	return "success";
	
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public MiddleFloorService getMiddleFloorService() {
	return middleFloorService;
}
public void setMiddleFloorService(MiddleFloorService middleFloorService) {
	this.middleFloorService = middleFloorService;
}
public MiddleFloor getMiddleFloor() {
	return middleFloor;
}
public void setMiddleFloor(MiddleFloor middleFloor) {
	this.middleFloor = middleFloor;
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
public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
}
public DistrictService getDistrictService() {
	return districtService;
}
public void setDistrictService(DistrictService districtService) {
	this.districtService = districtService;
}

}
