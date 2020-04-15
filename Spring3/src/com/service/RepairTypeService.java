package com.service;

import java.util.List;

import com.entities.RepairType;

public interface RepairTypeService {
	public void add(List<RepairType> repairTypes);
	public List<RepairType> findAll();
	public void delete(RepairType repairType1);
	public RepairType findById(Integer id);
	public void update(RepairType repairType1);
}
