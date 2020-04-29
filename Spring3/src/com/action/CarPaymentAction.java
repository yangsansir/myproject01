package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.taglibs.standard.tag.common.fmt.ParseDateSupport;
import org.apache.taglibs.standard.tag.el.fmt.ParseDateTag;

import com.entities.CarHoldBill;
import com.entities.CarPayment;
import com.entities.CarType;
import com.entities.CheckUser;
import com.entities.CostType;
import com.entities.GoodsCategory;
import com.service.CarPaymentService;
import com.service.CheckUserService;
import com.service.GoodsCategoryService;

public  class CarPaymentAction implements SessionAware{
	private Integer id;
	private CarPayment carPayment;
	private CarHoldBill carHoldBill;
	private CarPaymentService carPaymentService;
	private CheckUser checkUser;
	private Map<String, Object> session;
	private CheckUserService checkUserService;
	private GoodsCategoryService goodsCategoryService;
	private CarType carType;
	private int currentPage; 
	private int totalPage;
	private int totalSize;
	private int pageSize =4;
	public String  add(){
		List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
		session.put("goodsCategorylist", goodsCategorylist);
		List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
		session.put("checkUserlist", checkUserlist);
		return "success";
		
	}
	public String  add1(){
		List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
		session.put("goodsCategorylist", goodsCategorylist);
	
		return "success";
		
	}
	public String  addCarPayment(){
	
		carPaymentService.addCarPayment(carPayment, carHoldBill);
		return "success";
		
	}
	public String  findAll(){
		 if(currentPage==0){
			   currentPage = 1;
			  }
		 totalSize=carPaymentService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;
		List<CarPayment> carPaymentlist=carPaymentService.findAll(currentPage, pageSize);	
		session.put("carPaymentlist", carPaymentlist);
		return "success";
		
	}
	public String update(){

		carPaymentService.update(carPayment, carHoldBill);
		return "success";
		
	}
	public String  findById(){
		List<GoodsCategory> goodsCategorylist=goodsCategoryService.findAll(currentPage, pageSize);
		session.put("goodsCategorylist", goodsCategorylist);
		List<CheckUser>	checkUserlist=checkUserService.findAll(currentPage, pageSize);
		session.put("checkUserlist", checkUserlist);
		carPayment=carPaymentService.findById(id);
	
		return "success";
	}
	public String  delete(){
		carPayment=carPaymentService.findById(id);
		carPaymentService.delete(carPayment);
		return "success";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CarPayment getCarPayment() {
		return carPayment;
	}
	public void setCarPayment(CarPayment carPayment) {
		this.carPayment = carPayment;
	}
	public CarHoldBill getCarHoldBill() {
		return carHoldBill;
	}
	public void setCarHoldBill(CarHoldBill carHoldBill) {
		this.carHoldBill = carHoldBill;
	}
	public CarPaymentService getCarPaymentService() {
		return carPaymentService;
	}
	public void setCarPaymentService(CarPaymentService carPaymentService) {
		this.carPaymentService = carPaymentService;
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
	public CheckUser getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(CheckUser checkUser) {
		this.checkUser = checkUser;
	}

}
 