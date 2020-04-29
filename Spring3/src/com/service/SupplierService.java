package com.service;

import java.util.List;

import com.entities.CarType;
import com.entities.Supplier;

public interface SupplierService {
	public  void addsupplier(Supplier supplier);
	public  List<Supplier> findAll(int currentPage,int pageSize);

	public void delete(Supplier supplier );
	public Supplier findById(Integer id);
	public void update(Supplier supplier);
	public int getTotle();
}
