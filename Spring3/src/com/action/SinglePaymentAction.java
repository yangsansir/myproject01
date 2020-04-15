package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CheckUser;
import com.entities.CostType;
import com.entities.GoodsCategory;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;
import com.service.CheckUserService;
import com.service.CostTypeService;
import com.service.GoodsCategoryService;
import com.service.SinglePaymentService;

public class SinglePaymentAction implements SessionAware{
private Integer id;
private Map<String, Object> session;
private SinglePayment singlePayment;
private HouseHoldBill  houseHoldBill;
private CostType costType;
private CostTypeService costTypeService;
private SinglePaymentService singlePaymentService;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize=4;
private CheckUserService checkUserService;
private GoodsCategoryService goodsCategoryService;
public String  addsinglePayment(){
	singlePaymentService.addbillOutBody(houseHoldBill, singlePayment);
	return "success";
	
}
public String  add(){
	List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
	session.put("goodsCategorylist", goodsCategorylist);
	List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
	session.put("checkUserlist", checkUserlist);
	return "success";
	
	
}
public String SelectAll(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=singlePaymentService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<SinglePayment> singlePaymentlist=singlePaymentService.fingAll(currentPage, pageSize);
	session.put("singlePaymentlist", singlePaymentlist);
	return "success";
	
}
public String update(){

	singlePaymentService.update(houseHoldBill, singlePayment);
	return "success";
	
}
public String  findById(){
	List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
	session.put("goodsCategorylist", goodsCategorylist);
	List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
	session.put("checkUserlist", checkUserlist);
	singlePayment=singlePaymentService.findById(id);
	return "success";
}
public String  delete(){
	singlePayment=singlePaymentService.findById(id);
	singlePaymentService.delete(singlePayment);
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
	public HouseHoldBill getHouseHoldBill() {
		return houseHoldBill;
	}
	public void setHouseHoldBill(HouseHoldBill houseHoldBill) {
		this.houseHoldBill = houseHoldBill;
	}
	public CostType getCostType() {
		return costType;
	}
	public void setCostType(CostType costType) {
		this.costType = costType;
	}
	public SinglePaymentService getSinglePaymentService() {
		return singlePaymentService;
	}
	public void setSinglePaymentService(SinglePaymentService singlePaymentService) {
		this.singlePaymentService = singlePaymentService;
	}
	public SinglePayment getSinglePayment() {
		return singlePayment;
	}
	public void setSinglePayment(SinglePayment singlePayment) {
		this.singlePayment = singlePayment;
	}
	public CostTypeService getCostTypeService() {
		return costTypeService;
	}
	public void setCostTypeService(CostTypeService costTypeService) {
		this.costTypeService = costTypeService;
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
