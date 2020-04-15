package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Complaint;
import com.entities.Residernt;
import com.service.ComplaintService;

public class ComplaintAction implements SessionAware {
private Integer id;
private Complaint complaint;
private ComplaintService complaintService;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
public String add(){
	complaint.setCreateTime(new Date());
	complaintService.add(complaint);
	return "success";
	
}
public String delete(){
	complaint=complaintService.findById(id);
	complaintService.delete(complaint);
	return "success";
	
}
public String update(){
	complaintService.update(complaint);
	return "success";
	
}
public String findById(){
	complaint=complaintService.findById(id);
	return "success";
	
}
public String findAll(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=complaintService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Complaint>	complaintlist=complaintService.findAll(currentPage, pageSize);
	session.put("complaintlist", complaintlist);
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
public Complaint getComplaint() {
	return complaint;
}
public void setComplaint(Complaint complaint) {
	this.complaint = complaint;
}
public ComplaintService getComplaintService() {
	return complaintService;
}
public void setComplaintService(ComplaintService complaintService) {
	this.complaintService = complaintService;
}
public Map<String, Object> getSession() {
	return session;
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
