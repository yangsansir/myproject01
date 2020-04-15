package com.dao;

import java.util.List;

import com.entities.Goods;
import com.entities.Salary;
import com.entities.Sale;



public interface SaleDao {
public void addsale(Sale sale );
public List<Sale> findAll(int currentPage,int pageSize);
public void deletesale(Sale sale );
public Sale findById(Integer id);
public void updatesale(Sale sale);
public int getTotle();
public double totleprice();
public double query(String begindate,String enddate);
}
