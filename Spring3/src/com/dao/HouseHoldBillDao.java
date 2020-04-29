package com.dao;

import java.util.List;

import com.entities.Function;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;

public interface HouseHoldBillDao {
public  void addHouseHoldBill(HouseHoldBill houseHoldBill,SinglePayment singlePayment );
public  List<HouseHoldBill> findAll(int currentPage,int pageSize);
public  void update(HouseHoldBill houseHoldBill,SinglePayment singlePayment );
public void delete(HouseHoldBill houseHoldBill);
public HouseHoldBill findById(Integer id);
public void update(HouseHoldBill houseHoldBill );
public int getTotle();
}
