package com.service;

import java.util.List;

import com.entities.Goods;


public interface GoodsService {
public void addgoods(Goods goods );
public List<Goods> findAll(int currentPage,int pageSize);
public void deletegoods(Goods goods );
public Goods findById(Integer id);
public void updategoods(Goods goods);
public int getTotle();
public List<Goods> query(int currentPage,int pageSize,String keyword);
}
