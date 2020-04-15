package com.service.impl;

import java.util.List;

import com.dao.CarTypeDao;
import com.entities.CarType;
import com.service.CarTypeService;

public class CarTypeServiceImpl implements CarTypeService {
private CarTypeDao carTypeDao;
	@Override
	public void addCarType(CarType carType) {
		carTypeDao.addCarType(carType);
	}
	public CarTypeDao getCarTypeDao() {
		return carTypeDao;
	}
	public void setCarTypeDao(CarTypeDao carTypeDao) {
		this.carTypeDao = carTypeDao;
	}
	@Override
	public List<CarType> findAll(int currentPage,int pageSize) {
		List<CarType> carTypelist=carTypeDao.findAll(currentPage, pageSize);
		return carTypelist;
	}
	@Override
	public int getTotle() {
		
		return carTypeDao.getTotle();
	}
	@Override
	public void delete(CarType carType) {
		carTypeDao.delete(carType);
		
	}
	@Override
	public CarType findById(Integer id) {
		CarType carType=carTypeDao.findById(id);
		return carType;
	}
	@Override
	public void update(CarType carType) {
		carTypeDao.update(carType);
		
	}

}
