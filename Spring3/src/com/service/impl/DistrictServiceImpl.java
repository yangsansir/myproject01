package com.service.impl;

import java.util.List;

import com.dao.DistrictDao;
import com.entities.District;
import com.entities.MiddleFloor;
import com.service.DistrictService;

public class DistrictServiceImpl implements DistrictService {
    private DistrictDao districtDao;
	@Override
	public void addDistrict(District district,List<MiddleFloor> middleFloors) {
		districtDao.addDistrict(district, middleFloors);

	}
	public DistrictDao getDistrictDao() {
		return districtDao;
	}
	public void setDistrictDao(DistrictDao districtDao) {
		this.districtDao = districtDao;
	}
	@Override
	public List<District> getAllDistrict(int currentPage, int pageSize) {
		 List<District>  districtlist=districtDao.getAllDistrict(currentPage, pageSize);
		return districtlist;
	}
	@Override
	public District getDistrictbyId(Integer id) {
		District  district=districtDao.getDistrictbyId(id);
		return district;
	}
	@Override
	public List<MiddleFloor> findMiddleFloorByDistrictId(MiddleFloor middleFloor) {
		 List<MiddleFloor>  middleFloorlist=districtDao.findMiddleFloorByDistrictId(middleFloor);
		return middleFloorlist;
	}
	@Override
	public void delete(District district) {
		districtDao.delete(district);
		
	}
	@Override
	public District findById(Integer id) {
		District district=districtDao.findById(id);
		return district;
	}
	@Override
	public void update(District district) {
		districtDao.update(district);
		
	}

	@Override
	public int getTotle() {
		
		return districtDao.getTotle();
	}
	@Override
	public List<MiddleFloor> findByDistrictId(Integer id) {
		List<MiddleFloor> middlist=districtDao.findByDistrictId(id);
		return middlist;
	}

}
