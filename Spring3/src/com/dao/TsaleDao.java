package com.dao;

import java.util.List;

import com.entities.Tsale;



public interface TsaleDao {
public void addtsale(Tsale tsale );
public List<Tsale> findAll(int currentPage,int pageSize);
public void deletetsale(Tsale tsale );
public Tsale findById(Integer id);
public void updatetsale(Tsale tsale);
public int getTotle();
}
