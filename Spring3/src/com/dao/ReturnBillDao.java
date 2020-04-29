package com.dao;

import java.util.List;

import com.entities.ReturnBill;



public interface ReturnBillDao {
public void addreturnBill(ReturnBill returnBill );
public List<ReturnBill> findAll(int currentPage,int pageSize);
public void deletereturnBill(ReturnBill returnBill );
public ReturnBill findById(Integer id);
public void updatereturnBill(ReturnBill returnBill);
public int getTotle();
}
