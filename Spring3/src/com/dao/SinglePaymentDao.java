package com.dao;

import java.util.List;

import com.entities.BillOutBody;
import com.entities.BillOutHead;
import com.entities.HouseHoldBill;
import com.entities.Role;
import com.entities.SinglePayment;

public interface SinglePaymentDao {
	public void addbillOutBody(HouseHoldBill houseHoldBill, SinglePayment singlePayment);
	public List<SinglePayment> fingAll(int currentPage,int pageSize);
	public  void  update(HouseHoldBill houseHoldBill, SinglePayment singlePayment);
	public SinglePayment findById(Integer id);
	public void delete(SinglePayment singlePayment );
	public int getTotle();

}
