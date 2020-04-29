package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.District;
import com.entities.MonthReport;
import com.service.MonthReportService;

public class MonthReportAction implements SessionAware {
    private int id;
	private MonthReport monthReport;
	private MonthReportService monthReportService;
	private District district;
	private Map<String, Object> session;
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize=4;
	private double Itotle;
	private double Ototle;
	public String add(){
		monthReport.setCreateTime(new Date());
		monthReportService.add(monthReport);
		return "success";
		
	}
	public  String findAll(){
		 if(currentPage==0){
			   currentPage = 1;
			  }
		 totalSize=monthReportService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;
		List<MonthReport> monthReportlist=monthReportService.findAll(currentPage, pageSize);
		Itotle=monthReportService.Intotle();
		Ototle=monthReportService.Outtotle();
		session.put("monthReportlist", monthReportlist);
		
		return "success";
		
	}
	public String findById(){
		monthReport=monthReportService.findById(id);
		return "success";
	}
	public String delete(){
		monthReport=monthReportService.findById(id);
		monthReportService.delete(monthReport);
		return "success";
	}
	public String update(){
		monthReportService.update(monthReport);
		return "success";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MonthReport getMonthReport() {
		return monthReport;
	}
	public void setMonthReport(MonthReport monthReport) {
		this.monthReport = monthReport;
	}
	public MonthReportService getMonthReportService() {
		return monthReportService;
	}
	public void setMonthReportService(MonthReportService monthReportService) {
		this.monthReportService = monthReportService;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
