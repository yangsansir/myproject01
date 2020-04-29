package com.service.impl;

import java.util.List;

import com.dao.HouseHoldBillDao;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;
import com.service.HouseHoldBillService;

public class HouseHoldBillServiceImpl implements HouseHoldBillService {
private HouseHoldBillDao houseHoldBillDao;
	@Override
	public void addHouseHoldBill(HouseHoldBill houseHoldBill,
			SinglePayment singlePayment) {
		houseHoldBillDao.addHouseHoldBill(houseHoldBill, singlePayment);

	}
	@Override
	public List<HouseHoldBill> findAll(int currentPage, int pageSize) {
		List<HouseHoldBill> houseHoldBillList=houseHoldBillDao.findAll(currentPage, pageSize);
		return houseHoldBillList;
	}
	@Override
	public void update(HouseHoldBill houseHoldBill, SinglePayment singlePayment) {
		houseHoldBillDao.update(houseHoldBill, singlePayment);
		
	}
	public HouseHoldBillDao getHouseHoldBillDao() {
		return houseHoldBillDao;
	}
	public void setHouseHoldBillDao(HouseHoldBillDao houseHoldBillDao) {
		this.houseHoldBillDao = houseHoldBillDao;
	}
	
	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return houseHoldBillDao.getTotle();
	}
	

}
