package com.service.impl;

import java.util.List;

import com.dao.ParkInformationDao;
import com.entities.ParkInformation;
import com.service.ParkInformationService;

public class ParkInformationServiceImpl implements ParkInformationService {
  private ParkInformationDao parkInformationDao;
	@Override
	public void addParkInformation(ParkInformation parkInformation) {	
      parkInformationDao.addParkInformation(parkInformation);
	}
	
	@Override
	public List<ParkInformation> findAll(int currentPage,int pageSize) {
		List<ParkInformation> parkInformationlist=parkInformationDao.findAll(currentPage, pageSize);
		return parkInformationlist;
	}
	@Override
	public void delete(ParkInformation parkInformation) {
		parkInformationDao.delete(parkInformation);
		
	}
	@Override
	public ParkInformation findById(Integer id) {
		ParkInformation parkInformation=parkInformationDao.findById(id);
		return parkInformation;
	}
	@Override
	public void update(ParkInformation parkInformation) {
		parkInformationDao.update(parkInformation);
		
	}
	public ParkInformationDao getParkInformationDao() {
		return parkInformationDao;
	}
	public void setParkInformationDao(ParkInformationDao parkInformationDao) {
		this.parkInformationDao = parkInformationDao;
	}



	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return parkInformationDao.getTotle();
	}
}
