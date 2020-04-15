package com.dao;

import java.util.List;

import com.entities.CheckUser;


public interface CheckUserDao {
public void addcheckUser(CheckUser checkUser );
public List<CheckUser> findAll(int currentPage,int pageSize);
public void deletecheckUser(CheckUser checkUser );
public CheckUser findById(Integer id);
public void updatecheckUser(CheckUser checkUser);
public int getTotle();
}
