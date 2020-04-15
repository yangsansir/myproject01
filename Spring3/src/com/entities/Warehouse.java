package com.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 仓库信息
*/


public class Warehouse implements Serializable{
/**
	 * @author yang
	 */
	private static final long serialVersionUID = -5006774790517458166L;
private Integer id;
private String warehouseName;//仓库名
private String pyCode;//拼音码
private String location;//地址
private String description;//描述
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getWarehouseName() {
	return warehouseName;
}
public void setWarehouseName(String warehouseName) {
	this.warehouseName = warehouseName;
}
public String getPyCode() {
	return pyCode;
}
public void setPyCode(String pyCode) {
	this.pyCode = pyCode;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
