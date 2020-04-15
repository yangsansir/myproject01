package com.dao;

import java.util.List;

import com.entities.CostType;

public interface CostTypeDao {
public void addCostType(List<CostType> costTypes);
public List<CostType> findAll(int currentPage,int pageSize);
public void delete(CostType costType );
public CostType findById(Integer id);
public void update(CostType costType );
public int getTotle();
}
