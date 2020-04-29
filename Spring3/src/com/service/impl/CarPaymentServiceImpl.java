package com.service.impl;

import java.util.List;

import com.dao.CarPaymentDao;
import com.entities.CarHoldBill;
import com.entities.CarPayment;
import com.service.CarPaymentService;

public class CarPaymentServiceImpl implements CarPaymentService {
   private CarPaymentDao carPaymentDao;
	@Override
	public void addCarPayment(CarPayment carPayment,CarHoldBill carHoldBill) {
		carPaymentDao.addCarPayment(carPayment, carHoldBill);

	}

	@Override
	public List<CarPayment> findAll(int currentPage,int pageSize) {
		List<CarPayment> carPaymentlist=carPaymentDao.findAll(currentPage, pageSize);
		return carPaymentlist;
	}


	@Override
	public void delete(CarPayment carPayment) {
		carPaymentDao.delete(carPayment);
		
	}

	@Override
	public CarPayment findById(Integer id) {
		CarPayment carPayment=	carPaymentDao.findById(id);
		return carPayment;
	}

	@Override
	public void update(CarPayment carPayment, CarHoldBill carHoldBill) {
		carPaymentDao.update(carPayment, carHoldBill);
		
	}
	public CarPaymentDao getCarPaymentDao() {
		return carPaymentDao;
	}

	public void setCarPaymentDao(CarPaymentDao carPaymentDao) {
		this.carPaymentDao = carPaymentDao;
	}

	

	@Override
	public int getTotle() {
		return carPaymentDao.getTotle();
	}
}
