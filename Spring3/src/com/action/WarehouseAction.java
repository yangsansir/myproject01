package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Warehouse;

import com.opensymphony.xwork2.ActionSupport;
import com.service.WarehouseService;



@SuppressWarnings("serial")
public class WarehouseAction extends ActionSupport implements SessionAware {
	private Integer id;
	private int currentPage;//当前页
	private int totalPage;//总页数
	private int totalSize;//总记录
	private int pageSize =4;
	private Map<String, Object> session;
	private WarehouseService warehouseService;
	private Warehouse warehouse;
	public String add(){
		warehouseService.addwarehouse(warehouse);
		return SUCCESS;		
	}
	public String findAll(){
		  if(currentPage==0){
			   currentPage = 1;
			  }
			  totalSize=warehouseService.getTotle();
			  
			  int mod = totalSize%pageSize;
			   if(mod==0){
			    totalPage = totalSize/pageSize;
			   }else
			    totalPage = totalSize/pageSize+1;
		List<Warehouse> warehouselist=warehouseService.findAll(currentPage, pageSize);
		session.put("warehouselist", warehouselist);
		return SUCCESS;
	}
	public String findById(){
		warehouse=warehouseService.findById(id);
		return "success";
	}
	public String delete(){
		warehouse=warehouseService.findById(id);
		warehouseService.delete(warehouse);
		return "success";
	}
	public String update(){
		warehouseService.update(warehouse);
		return "success";
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
	
	public WarehouseService getWarehouseService() {
		return warehouseService;
	}
	public void setWarehouseService(WarehouseService warehouseService) {
		this.warehouseService = warehouseService;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public int getCurrentPage() {
		return currentPage;
	}
  
}
