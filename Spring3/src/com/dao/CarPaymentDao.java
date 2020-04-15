package com.dao;

import java.util.List;

import com.entities.CarHoldBill;
import com.entities.CarPayment;
import com.entities.Messages;

public interface CarPaymentDao {
public void addCarPayment(CarPayment carPayment,CarHoldBill carHoldBill);
public List<CarPayment> findAll(int currentPage,int pageSize);
public void delete(CarPayment carPayment );
public CarPayment findById(Integer id);
public void update(CarPayment carPayment,CarHoldBill carHoldBill);
public int getTotle();
}
