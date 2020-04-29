package com.service;

import java.util.List;

import com.entities.HouseHoldBill;
import com.entities.SinglePayment;

public interface HouseHoldBillService {
	public  void addHouseHoldBill(HouseHoldBill houseHoldBill,SinglePayment singlePayment );
	public  List<HouseHoldBill> findAll(int currentPage,int pageSize);
	public  void update(HouseHoldBill houseHoldBill,SinglePayment singlePayment );
	public int getTotle();
}
