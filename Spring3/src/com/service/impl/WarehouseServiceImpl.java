package com.service.impl;

import java.util.List;

import com.dao.WarehouseDao;

import com.entities.Warehouse;

import com.service.WarehouseService;


public class WarehouseServiceImpl implements WarehouseService {
private WarehouseDao warehouseDao;
	@Override
	public void addwarehouse(Warehouse warehouse) {
		warehouseDao.addwarehouse(warehouse);
	}
	
	@Override
	public List<Warehouse> findAll(int currentPage,int pageSize) {
		List<Warehouse> warehouselist=warehouseDao.findAll(currentPage, pageSize);
		return warehouselist;
	}
	@Override
	public int getTotle() {
		
		return warehouseDao.getTotle();
	}
	@Override
	public void delete(Warehouse warehouse) {
		warehouseDao.delete(warehouse);
		
	}
	@Override
	public Warehouse findById(Integer id) {
		Warehouse warehouse=warehouseDao.findById(id);
		return warehouse;
	}
	@Override
	public void update(Warehouse warehouse) {
		warehouseDao.update(warehouse);
		
	}

	public WarehouseDao getWarehouseDao() {
		return warehouseDao;
	}

	public void setWarehouseDao(WarehouseDao warehouseDao) {
		this.warehouseDao = warehouseDao;
	}

}
