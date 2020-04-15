package com.service.impl;

import java.util.List;

import com.dao.CustomerDao;

import com.entities.Customer;

import com.service.CustomerService;


public class CustomerServiceImpl implements CustomerService {
     private CustomerDao customerDao;
	@Override
	public void addcustomer(Customer customer) {
		customerDao.addcustomer(customer);

	}

	@Override
	public List<Customer> findAll(int currentPage, int pageSize) {
		List<Customer>	customerlist=	customerDao.findAll(currentPage, pageSize);
		return customerlist;
	}

	@Override
	public void deletecustomer(Customer customer) {
		customerDao.deletecustomer(customer);

	}

	@Override
	public Customer findById(Integer id) {
		Customer customer=customerDao.findById(id);
		return customer;
	}

	@Override
	public void updatecustomer(Customer customer) {
		customerDao.updatecustomer(customer);
	}



	

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return customerDao.getTotle();
	}

}
