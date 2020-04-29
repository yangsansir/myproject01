package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CarType;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CarTypeService;

@SuppressWarnings("serial")
public class CarTypeAction extends ActionSupport implements SessionAware {
	private Integer id;
	private int currentPage;//当前页
	private int totalPage;//总页数
	private int totalSize;//总记录数
	private int pageSize =4;
	private Map<String, Object> session;
	private CarTypeService carTypeService;
	private CarType carType;
	public String addCarType(){
		carTypeService.addCarType(carType);
		return SUCCESS;		
	}
	public String findAll(){
		  if(currentPage==0){
			   currentPage = 1;
			  }
			  totalSize=carTypeService.getTotle();
			  
			  int mod = totalSize%pageSize;
			   if(mod==0){
			    totalPage = totalSize/pageSize;
			   }else
			    totalPage = totalSize/pageSize+1;
		List<CarType> carTypelist=carTypeService.findAll(currentPage, pageSize);
		session.put("carTypelist", carTypelist);
		return SUCCESS;
	}
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarTypeService getCarTypeService() {
		return carTypeService;
	}

	public void setCarTypeService(CarTypeService carTypeService) {
		this.carTypeService = carTypeService;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
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
