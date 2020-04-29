package com.entities;

import java.io.Serializable;

/*
 * 费用类型
 */
@SuppressWarnings("serial")
public class CostType implements Serializable {
private  Integer id;
private  String  CostTypeName;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCostTypeName() {
	return CostTypeName;
}
public void setCostTypeName(String costTypeName) {
	CostTypeName = costTypeName;
}

}
