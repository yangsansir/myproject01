package com.service.impl;

import java.util.List;

import com.dao.BillOutBodyDao;

import com.entities.BillOutBody;
import com.entities.BillOutHead;
import com.entities.CarHoldBill;

import com.service.BillOutBodyService;


public class BillOutBodyServiceImpl implements BillOutBodyService {
   private BillOutBodyDao billOutBodyDao;
	@Override
	public void addbillOutBody(BillOutBody billOutBody,BillOutHead billOutHead) {
		billOutBodyDao.addbillOutBody(billOutBody, billOutHead);

	}

	@Override
	public List<BillOutBody> findAll(int currentPage,int pageSize) {
		List<BillOutBody> billOutBodylist=billOutBodyDao.findAll(currentPage, pageSize);
		return billOutBodylist;
	}


	@Override
	public void delete(BillOutBody billOutBody) {
		billOutBodyDao.delete(billOutBody);
		
	}

	@Override
	public BillOutBody findById(Integer id) {
		BillOutBody billOutBody=	billOutBodyDao.findById(id);
		return billOutBody;
	}

	@Override
	public void update(BillOutBody billOutBody,BillOutHead billOutHead) {
		billOutBodyDao.update(billOutBody, billOutHead);
		
	}


	

	public BillOutBodyDao getBillOutBodyDao() {
		return billOutBodyDao;
	}

	public void setBillOutBodyDao(BillOutBodyDao billOutBodyDao) {
		this.billOutBodyDao = billOutBodyDao;
	}

	@Override
	public int getTotle() {
		return billOutBodyDao.getTotle();
	}
}
