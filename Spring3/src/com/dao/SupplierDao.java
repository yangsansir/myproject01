package com.dao;

import java.util.List;

import com.entities.CarHoldBill;
import com.entities.CarPayment;
import com.entities.Supplier;


public  interface SupplierDao {
public  void addsupplier(Supplier supplier);
public  List<Supplier> findAll(int currentPage,int pageSize);

public void delete(Supplier supplier );
public Supplier findById(Integer id);
public void update(Supplier supplier);
public int getTotle();
}
