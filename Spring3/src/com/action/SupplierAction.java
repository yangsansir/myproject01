package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Supplier;
import com.opensymphony.xwork2.ActionSupport;
import com.service.SupplierService;


@SuppressWarnings("serial")
public class SupplierAction extends ActionSupport implements SessionAware {
	private Integer id;
	private int currentPage;//当前页
	private int totalPage;//总页数
	private int totalSize;//总记录
	private int pageSize =4;
	private Map<String, Object> session;
	private SupplierService supplierService;
	private Supplier supplier;
	public String addsupplier(){
		supplierService.addsupplier(supplier);
		return SUCCESS;		
	}
	public String findAll(){
		  if(currentPage==0){
			   currentPage = 1;
			  }
			  totalSize=supplierService.getTotle();
			  
			  int mod = totalSize%pageSize;
			   if(mod==0){
			    totalPage = totalSize/pageSize;
			   }else
			    totalPage = totalSize/pageSize+1;
		List<Supplier> supplierlist=supplierService.findAll(currentPage, pageSize);
		session.put("supplierlist", supplierlist);
		return SUCCESS;
	}
	public String findById(){
		supplier=supplierService.findById(id);
		return "success";
	}
	public String delete(){
		supplier=supplierService.findById(id);
		supplierService.delete(supplier);
		return "success";
	}
	public String update(){
		supplierService.update(supplier);
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
	public SupplierService getSupplierService() {
		return supplierService;
	}
	public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getCurrentPage() {
		return currentPage;
	}
  
}
