package com.service;

import java.util.List;

import com.entities.District;
import com.entities.MiddleFloor;

public interface DistrictService {
	public void addDistrict(District district,List<MiddleFloor> middleFloors);
	public List<District> getAllDistrict(int currentPage,int pageSize);
	public List< MiddleFloor> findMiddleFloorByDistrictId(MiddleFloor middleFloor);
	public  District getDistrictbyId(Integer id);
	public void delete(District district );
	public District findById(Integer id);
	public void update(District district );
	public int getTotle();
	public List< MiddleFloor> findByDistrictId(Integer id);
	
}
