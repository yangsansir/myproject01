package com.service;

import java.util.List;

import com.entities.CarType;

public interface CarTypeService {
	public  void addCarType(CarType carType);
	public  List<CarType> findAll(int currentPage,int pageSize);
	public   int  getTotle();
	public void delete(CarType carType );
	public CarType findById(Integer id);
	public void update(CarType carType);
}
