package com.dao;

import java.util.List;


import com.entities.ParkInformation;

public interface ParkInformationDao {
	public void addParkInformation( ParkInformation parkInformation);
	public List<ParkInformation> findAll(int currentPage,int pageSize);
	public void delete(ParkInformation parkInformation );
	public ParkInformation findById(Integer id);
	public void update( ParkInformation parkInformation );
	public int getTotle();
}
