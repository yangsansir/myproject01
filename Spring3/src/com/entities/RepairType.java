package com.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/*
 * �������ͱ�
 */
@SuppressWarnings("serial")
public class RepairType implements Serializable {
private Integer id;
private String RepairType;
private Set<Repair> repairSet=new HashSet<Repair>();

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRepairType() {
	return RepairType;
}
public void setRepairType(String repairType) {
	RepairType = repairType;
}
public Set<Repair> getRepairSet() {
	return repairSet;
}
public void setRepairSet(Set<Repair> repairSet) {
	this.repairSet = repairSet;
}

}
