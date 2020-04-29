package com.service.impl;

import java.util.List;

import com.dao.RepairTypeDao;
import com.entities.RepairType;
import com.service.RepairTypeService;

public class RepairTypeServiceImpl implements RepairTypeService {
    private RepairTypeDao repairTypeDao;
	@Override
	public void add(List<RepairType> repairTypes) {
		repairTypeDao.add(repairTypes);

	}
	@Override
	public List<RepairType> findAll() {
		 List<RepairType> repairTypelist=repairTypeDao.findAll();
		return repairTypelist;
	}

	@Override
	public void delete(RepairType repairType1) {
		repairTypeDao.delete(repairType1);

	}

	@Override
	public RepairType findById(Integer id) {
		RepairType repairType1=	repairTypeDao.findById(id);
		return repairType1;
	}

	@Override
	public void update(RepairType repairType1) {
		repairTypeDao.update(repairType1);

	}

	public RepairTypeDao getRepairTypeDao() {
		return repairTypeDao;
	}

	public void setRepairTypeDao(RepairTypeDao repairTypeDao) {
		this.repairTypeDao = repairTypeDao;
	}

}
