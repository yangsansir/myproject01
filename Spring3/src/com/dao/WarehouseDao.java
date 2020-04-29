package com.dao;

import java.util.List;

import com.entities.Warehouse;


public  interface WarehouseDao {
public  void addwarehouse(Warehouse warehouse);
public  List<Warehouse> findAll(int currentPage,int pageSize);
public void delete(Warehouse warehouse );
public Warehouse findById(Integer id);
public void update(Warehouse warehouse);
public int getTotle();
}
