package com.service.impl;

import java.util.List;

import com.dao.SaleDao;
import com.entities.Sale;
import com.service.SaleService;



public class SaleServiceImpl implements SaleService {
     private SaleDao saleDao;
	@Override
	public void addsale(Sale sale) {
		saleDao.addsale(sale);

	}

	@Override
	public List<Sale> findAll(int currentPage, int pageSize) {
		List<Sale>	salelist=	saleDao.findAll(currentPage, pageSize);
		return salelist;
	}

	@Override
	public void deletesale(Sale sale) {
		saleDao.deletesale(sale);

	}

	@Override
	public Sale findById(Integer id) {
		Sale sale=saleDao.findById(id);
		return sale;
	}

	@Override
	public void updatesale(Sale sale) {
		saleDao.updatesale(sale);
	}



	

	public SaleDao getsaleDao() {
		return saleDao;
	}

	public void setsaleDao(SaleDao saleDao) {
		this.saleDao = saleDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return saleDao.getTotle();
	}

	@Override
	public double totleprice() {
		
		return saleDao.totleprice();
	}

	@Override
	public double query(String begindate, String enddate) {
		// TODO Auto-generated method stub
		 return saleDao.query(begindate, enddate);
	}

}
