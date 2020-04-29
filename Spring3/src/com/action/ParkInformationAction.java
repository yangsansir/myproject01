package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.CarType;
import com.entities.ParkInformation;
import com.service.CarTypeService;
import com.service.ParkInformationService;

@SuppressWarnings("serial")
public class ParkInformationAction implements SessionAware {
	private Integer id;
	private CarType carType;
	private ParkInformation parkInformation;
    private ParkInformationService parkInformationService;
    private int currentPage;
    private int totalPage;
    private int totalSize;
    private int pageSize=4;
    private CarTypeService carTypeService;
	private Map<String, Object> session;
	public String addParkInformation() {
        parkInformationService.addParkInformation(parkInformation);
		return "success";
	}
	public  String findAll(){
		 if(currentPage==0){
			   currentPage = 1;
			  }
		 totalSize=parkInformationService.getTotle();
		  
		  int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;
		List<ParkInformation> parkInformationlist=parkInformationService.findAll(currentPage, pageSize);
		session.put("parkInformationlist", parkInformationlist);
		return "success";
		
	}
	public String findById(){
		List<CarType> carTypelist=carTypeService.findAll(currentPage, pageSize);
		session.put("carTypelist", carTypelist);
		parkInformation=parkInformationService.findById(id);
		return "success";
	}
	public String delete(){
		parkInformation=parkInformationService.findById(id);
		parkInformationService.delete(parkInformation);
		return "success";
	}
	public String update(){
		parkInformationService.update(parkInformation);
		return "success";
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public ParkInformation getParkInformation() {
		return parkInformation;
	}

	public void setParkInformation(ParkInformation parkInformation) {
		this.parkInformation = parkInformation;
	}

	public ParkInformationService getParkInformationService() {
		return parkInformationService;
	}

	public void setParkInformationService(
			ParkInformationService parkInformationService) {
		this.parkInformationService = parkInformationService;
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
	public CarTypeService getCarTypeService() {
		return carTypeService;
	}
	public void setCarTypeService(CarTypeService carTypeService) {
		this.carTypeService = carTypeService;
	}
   
}
