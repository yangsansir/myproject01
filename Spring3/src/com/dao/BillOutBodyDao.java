package com.dao;

import java.util.List;

import com.entities.BillOutBody;
import com.entities.BillOutHead;
import com.entities.CarHoldBill;

import com.entities.Messages;

public interface BillOutBodyDao {
public void addbillOutBody(BillOutBody billOutBody,BillOutHead billOutHead);
public List<BillOutBody> findAll(int currentPage,int pageSize);
public void delete(BillOutBody billOutBody );
public BillOutBody findById(Integer id);
public void update(BillOutBody billOutBody,BillOutHead billOutHead);
public int getTotle();
}
