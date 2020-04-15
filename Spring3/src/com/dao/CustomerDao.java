package com.dao;

import java.util.List;

import com.entities.Customer;


public interface CustomerDao {
public void addcustomer(Customer customer );
public List<Customer> findAll(int currentPage,int pageSize);
public void deletecustomer(Customer customer );
public Customer findById(Integer id);
public void updatecustomer(Customer customer);
public int getTotle();
}
