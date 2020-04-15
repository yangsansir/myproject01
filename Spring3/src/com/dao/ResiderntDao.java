package com.dao;

import java.util.List;

import com.entities.Residernt;

public interface ResiderntDao {
public void addresidernt(Residernt residernt );
public Residernt login(String LoginName,String Password);
public List<Residernt> fingAll(int currentPage,int pageSize);
public void updateResidernt(Residernt residernt);
public Residernt findById(Integer id);
public void delete(Residernt residernt );
public int getTotle();
} 
