package com.dao;

import java.util.List;

import com.entities.CarHoldBill;
import com.entities.CarPayment;
import com.entities.CarType;

public  interface CarTypeDao {
public  void addCarType(CarType carType);
public  List<CarType> findAll(int currentPage,int pageSize);

public void delete(CarType carType1 );
public CarType findById(Integer id);
public void update(CarType carType1);
public int getTotle();
}
