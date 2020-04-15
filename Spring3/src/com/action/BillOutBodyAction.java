package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.BillOutBody;
import com.entities.BillOutHead;
import com.entities.CarHoldBill;
import com.entities.CarType;
import com.entities.CheckUser;
import com.entities.CostType;
import com.entities.GoodsCategory;
import com.service.BillOutBodyService;
import com.service.CheckUserService;
import com.service.GoodsCategoryService;


public  class BillOutBodyAction implements SessionAware{
	private Integer id;
	private BillOutBody billOutBody;
	private BillOutHead billOutHead;
	private BillOutBodyService billOutBodyService;
	private Map<String, Object> session;
	private CarType carType;
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize =3;
	private CheckUserService checkUserService;
	private GoodsCategoryService goodsCategoryService;
	public String  add(){
		List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
		session.put("goodsCategorylist", goodsCategorylist);
		List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
		session.put("checkUserlist", checkUserlist);
		return "success";
		
	}
	public String  addbillOutBody(){
		billOutBodyService.addbillOutBody(billOutBody, billOutHead);
		return "success";
		
	}
	public String  findAll(){
		 if(currentPage==0){
			   currentPage = 1;
			  }
		 totalSize=billOutBodyService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;
		List<BillOutBody> billOutBodylist=billOutBodyService.findAll(currentPage, pageSize);	
		session.put("billOutBodylist", billOutBodylist);
		return "success";
		
	}
	public String update(){
	
		billOutBodyService.update(billOutBody, billOutHead);
		return "success";
		
	}
	public String  findById(){
		List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
		session.put("goodsCategorylist", goodsCategorylist);
		List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
		session.put("checkUserlist", checkUserlist);
		billOutBody=billOutBodyService.findById(id);
	/*	List<CostType> costTypelist=billOutBodyService.findAll(currentPage, pageSize);
		session.put("costTypelist", costTypelist);*/
		return "success";
	}
	public String  delete(){
		billOutBody=billOutBodyService.findById(id);
		billOutBodyService.delete(billOutBody);
		return "success";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
	this.session=session;
		
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
	public BillOutBody getBillOutBody() {
		return billOutBody;
	}
	public void setBillOutBody(BillOutBody billOutBody) {
		this.billOutBody = billOutBody;
	}
	public BillOutHead getBillOutHead() {
		return billOutHead;
	}
	public void setBillOutHead(BillOutHead billOutHead) {
		this.billOutHead = billOutHead;
	}
	public BillOutBodyService getBillOutBodyService() {
		return billOutBodyService;
	}
	public void setBillOutBodyService(BillOutBodyService billOutBodyService) {
		this.billOutBodyService = billOutBodyService;
	}
	public CheckUserService getCheckUserService() {
		return checkUserService;
	}
	public void setCheckUserService(CheckUserService checkUserService) {
		this.checkUserService = checkUserService;
	}
	public GoodsCategoryService getGoodsCategoryService() {
		return goodsCategoryService;
	}
	public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
		this.goodsCategoryService = goodsCategoryService;
	}

}
 