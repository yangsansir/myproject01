package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.District;
import com.entities.MonthReport;
import com.entities.YearReport;
import com.service.YearReportService;

public class YearReportAction implements SessionAware {
private int id;
private YearReport yearReport;
private YearReportService yearReportService;
private  District district;
private Map<String, Object> session;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
private double Itotle;
private double Ototle;
public String add(){
	yearReport.setCreateTime(new Date());
	yearReportService.addCarType(yearReport);
	return "success";
	
}
public  String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=yearReportService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<YearReport> yearReportlist=yearReportService.findAll(currentPage, pageSize);
	Itotle=yearReportService.Intotle();
	Ototle=yearReportService.Outtotle();
	session.put("yearReportlist", yearReportlist);
	return "success";
	
}
public String findById(){
	yearReport=yearReportService.findById(id);
	return "success";
}
public String delete(){
	yearReport=yearReportService.findById(id);
	yearReportService.delete(yearReport);
	return "success";
}
public String update(){
	yearReportService.update(yearReport);
	return "success";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public YearReport getYearReport() {
	return yearReport;
}
public void setYearReport(YearReport yearReport) {
	this.yearReport = yearReport;
}
public YearReportService getYearReportService() {
	return yearReportService;
}
public void setYearReportService(YearReportService yearReportService) {
	this.yearReportService = yearReportService;
}
public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
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
@Override
public void setSession(Map<String, Object> session) {
this.session=session;
	
}
public double getItotle() {
	return Itotle;
}
public void setItotle(double itotle) {
	Itotle = itotle;
}
public double getOtotle() {
	return Ototle;
}
public void setOtotle(double ototle) {
	Ototle = ototle;
}

}
