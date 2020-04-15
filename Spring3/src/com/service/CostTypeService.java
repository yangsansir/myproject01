package com.service;

import java.util.List;

import com.dao.CostTypeDao;
import com.entities.CostType;

public interface CostTypeService {
	public void addCostType(List<CostType> costTypes);
	public List<CostType> findAll(int currentPage,int pageSize);
	public void delete(CostType costType1);
	public CostType findById(Integer id);
	public void update(CostType costType1 );
	public int getTotle();
}
