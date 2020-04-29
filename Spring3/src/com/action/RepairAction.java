package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Repair;
import com.entities.RepairType;
import com.entities.Residernt;
import com.service.RepairService;
import com.service.RepairTypeService;

public class RepairAction implements SessionAware {
	private Integer id;
	private Repair repair;
	private Residernt residernt;
	private RepairType repairType;
	private RepairService repairService;
	private RepairTypeService repairTypeService;
	private Map<String, Object> session;
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize=4;
	public String addrepair() {
		repair.setCreateTime(new Date());
		repairService.add(repair);
		return "success";
	}

	public String delete() {
		repair = repairService.findById(id);
		repairService.delete(repair);
		return "success";

	}

	public String update() {
		repairService.update(repair);
		return "success";

	}

	public String findById() {
		List<RepairType> repairTypelist=repairTypeService.findAll();
		session.put("repairTypelist", repairTypelist);
		repair = repairService.findById(id);
		return "success";

	}

	public String findAll() {
		 if(currentPage==0){
			   currentPage = 1;
			  }
			  totalSize=repairService.getTotle();
			  
			  int mod = totalSize%pageSize;
			   if(mod==0){
			    totalPage = totalSize/pageSize;
			   }else
			    totalPage = totalSize/pageSize+1;
		List<Repair> repairlist = repairService.findAll(currentPage, pageSize);
		session.put("repairlist", repairlist);
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

	public Repair getRepair() {
		return repair;
	}

	public void setRepair(Repair repair) {
		this.repair = repair;
	}

	public RepairType getRepairType() {
		return repairType;
	}

	public void setRepairType(RepairType repairType) {
		this.repairType = repairType;
	}

	public RepairService getRepairService() {
		return repairService;
	}

	public void setRepairService(RepairService repairService) {
		this.repairService = repairService;
	}

	public Residernt getResidernt() {
		return residernt;
	}

	public void setResidernt(Residernt residernt) {
		this.residernt = residernt;
	}

	public RepairTypeService getRepairTypeService() {
		return repairTypeService;
	}

	public void setRepairTypeService(RepairTypeService repairTypeService) {
		this.repairTypeService = repairTypeService;
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
