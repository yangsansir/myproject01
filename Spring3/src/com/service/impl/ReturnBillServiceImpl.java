package com.service.impl;

import java.util.List;

import com.dao.ReturnBillDao;

import com.entities.ReturnBill;

import com.service.ReturnBillService;



public class ReturnBillServiceImpl implements ReturnBillService {
     private ReturnBillDao returnBillDao;
	@Override
	public void addreturnBill(ReturnBill returnBill) {
		returnBillDao.addreturnBill(returnBill);

	}

	@Override
	public List<ReturnBill> findAll(int currentPage, int pageSize) {
		List<ReturnBill>	returnBilllist=	returnBillDao.findAll(currentPage, pageSize);
		return returnBilllist;
	}

	@Override
	public void deletereturnBill(ReturnBill returnBill) {
		returnBillDao.deletereturnBill(returnBill);

	}

	@Override
	public ReturnBill findById(Integer id) {
		ReturnBill returnBill=returnBillDao.findById(id);
		return returnBill;
	}

	@Override
	public void updatereturnBill(ReturnBill returnBill) {
		returnBillDao.updatereturnBill(returnBill);
	}



	

	public ReturnBillDao getreturnBillDao() {
		return returnBillDao;
	}

	public void setreturnBillDao(ReturnBillDao returnBillDao) {
		this.returnBillDao = returnBillDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return returnBillDao.getTotle();
	}

}
