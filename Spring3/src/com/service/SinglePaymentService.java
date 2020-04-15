package com.service;

import java.util.List;

import com.entities.HouseHoldBill;
import com.entities.SinglePayment;

public interface SinglePaymentService {
	public void addbillOutBody(HouseHoldBill houseHoldBill, SinglePayment singlePayment);
	public List<SinglePayment> fingAll(int currentPage,int pageSize);
	public  void  update(HouseHoldBill houseHoldBill,SinglePayment singlePayment);
	public SinglePayment findById(Integer id);
	public void delete(SinglePayment singlePayment );
	public int getTotle();
}
