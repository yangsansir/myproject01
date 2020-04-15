package com.service.impl;

import java.util.List;

import com.dao.RepairDao;
import com.entities.Repair;
import com.service.RepairService;

public class RepairServiceImpl implements RepairService {
      private RepairDao repairDao;
	@Override
	public void add(Repair repair) {
		repairDao.add(repair);

	}

	@Override
	public List<Repair> findAll(int currentPage, int pageSize) {
		List<Repair> repairlist=repairDao.findAll(currentPage, pageSize);
		return repairlist;
	}

	@Override
	public void delete(Repair repair) {
		repairDao.delete(repair);

	}

	@Override
	public Repair findById(Integer id) {
		Repair repair=	repairDao.findById(id);
		return repair;
	}

	@Override
	public void update(Repair repair) {
		repairDao.update(repair);

	}

	public RepairDao getRepairDao() {
		return repairDao;
	}

	public void setRepairDao(RepairDao repairDao) {
		this.repairDao = repairDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return repairDao.getTotle();
	}

}
