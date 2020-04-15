package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.RepairType;
import com.service.RepairTypeService;

public class RepairTypeAction implements SessionAware {
private Integer id;
private List<RepairType> repairType;
private RepairType repairType1;
private RepairTypeService repairTypeService;
private Map<String, Object> session;
public String add(){
	repairTypeService.add(repairType);
	return "success";
	
}
public String delete(){
	repairType1= repairTypeService.findById(id);
	repairTypeService.delete(repairType1);
	return "success";
	
}
public String update(){
	repairTypeService.update(repairType1);
	return "success";
	
}
public String findById(){
	 repairType1= repairTypeService.findById(id);
	return "success";
	
}
public String findAll(){
	List<RepairType> repairTypelist=repairTypeService.findAll();
	session.put("repairTypelist", repairTypelist);
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

public List<RepairType> getRepairType() {
	return repairType;
}
public void setRepairType(List<RepairType> repairType) {
	this.repairType = repairType;
}
public RepairTypeService getRepairTypeService() {
	return repairTypeService;
}
public void setRepairTypeService(RepairTypeService repairTypeService) {
	this.repairTypeService = repairTypeService;
}
public RepairType getRepairType1() {
	return repairType1;
}
public void setRepairType1(RepairType repairType1) {
	this.repairType1 = repairType1;
}

}
