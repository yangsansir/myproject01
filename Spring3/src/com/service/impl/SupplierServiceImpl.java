package com.service.impl;

import java.util.List;

import com.dao.SupplierDao;

import com.entities.Supplier;

import com.service.SupplierService;


public class SupplierServiceImpl implements SupplierService {
private SupplierDao supplierDao;
	@Override
	public void addsupplier(Supplier supplier) {
		supplierDao.addsupplier(supplier);
	}
	
	public SupplierDao getSupplierDao() {
		return supplierDao;
	}

	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	}

	@Override
	public List<Supplier> findAll(int currentPage,int pageSize) {
		List<Supplier> supplierlist=supplierDao.findAll(currentPage, pageSize);
		return supplierlist;
	}
	@Override
	public int getTotle() {
		
		return supplierDao.getTotle();
	}
	@Override
	public void delete(Supplier supplier) {
		supplierDao.delete(supplier);
		
	}
	@Override
	public Supplier findById(Integer id) {
		Supplier supplier=supplierDao.findById(id);
		return supplier;
	}
	@Override
	public void update(Supplier supplier) {
		supplierDao.update(supplier);
		
	}

}
