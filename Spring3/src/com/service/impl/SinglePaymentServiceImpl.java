package com.service.impl;

import java.util.List;

import com.dao.SinglePaymentDao;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;
import com.service.SinglePaymentService;

public class SinglePaymentServiceImpl implements SinglePaymentService {
private SinglePaymentDao singlePaymentDao;
	@Override
	public List<SinglePayment> fingAll(int currentPage, int pageSize) {
		List<SinglePayment> singlePaymentlist=singlePaymentDao.fingAll(currentPage, pageSize);
		return singlePaymentlist;
	}
	public SinglePaymentDao getSinglePaymentDao() {
		return singlePaymentDao;
	}
	public void setSinglePaymentDao(SinglePaymentDao singlePaymentDao) {
		this.singlePaymentDao = singlePaymentDao;
	}
	@Override
	public void update(HouseHoldBill houseHoldBill,SinglePayment singlePayment) {
		singlePaymentDao.update(houseHoldBill, singlePayment);
		
	}
	@Override
	public SinglePayment findById(Integer id) {
		SinglePayment singlePayment=singlePaymentDao.findById(id);
		return singlePayment;
	}
	@Override
	public void delete(SinglePayment singlePayment) {
		singlePaymentDao.delete(singlePayment);
		
	}

	@Override
	public int getTotle() {
		
		return singlePaymentDao.getTotle();
	}
	@Override
	public void addbillOutBody(HouseHoldBill houseHoldBill,
			SinglePayment singlePayment) {
		singlePaymentDao.addbillOutBody(houseHoldBill, singlePayment);
		
	}

}
