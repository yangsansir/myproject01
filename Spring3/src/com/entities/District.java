package com.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/*
 * 小区信息表
 */
@SuppressWarnings("serial")
public class District implements Serializable {
private Integer id;
private String DistrictName;//小区名
private String  DistrictAddress;//小区地址
private Set<MiddleFloor> middleFloorSet=new HashSet<MiddleFloor>();//楼栋
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDistrictName() {
	return DistrictName;
}
public void setDistrictName(String districtName) {
	DistrictName = districtName;
}
public String getDistrictAddress() {
	return DistrictAddress;
}
public void setDistrictAddress(String districtAddress) {
	DistrictAddress = districtAddress;
}
public Set<MiddleFloor> getMiddleFloorSet() {
	return middleFloorSet;
}
public void setMiddleFloorSet(Set<MiddleFloor> middleFloorSet) {
	this.middleFloorSet = middleFloorSet;
}
@Override
public String toString() {
	return "District [id=" + id + ", DistrictName=" + DistrictName
			+ ", DistrictAddress=" + DistrictAddress + ", middleFloorSet="
			+ middleFloorSet + "]";
}



}
