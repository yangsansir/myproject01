package com.service.impl;

import java.util.List;

import com.dao.CostTypeDao;
import com.entities.CostType;
import com.service.CostTypeService;

public class CostTypeServiceImpl implements CostTypeService {
private CostTypeDao costTypeDao;
	@Override
	public void addCostType(List<CostType> costTypes) {
		costTypeDao.addCostType(costTypes);

	}
	public CostTypeDao getCostTypeDao() {
		return costTypeDao;
	}
	public void setCostTypeDao(CostTypeDao costTypeDao) {
		this.costTypeDao = costTypeDao;
	}
	@Override
	public List<CostType> findAll(int currentPage, int pageSize) {
		List<CostType> costTypelist=costTypeDao.findAll(currentPage, pageSize);
		return costTypelist;
	}
	@Override
	public void delete(CostType costType1) {
		costTypeDao.delete(costType1);
		
	}
	@Override
	public CostType findById(Integer id) {
		CostType costType1=costTypeDao.findById(id);
		return costType1;
	}
	@Override
	public void update(CostType costType1) {
		costTypeDao.update(costType1);
		
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return costTypeDao.getTotle();
	}

}
