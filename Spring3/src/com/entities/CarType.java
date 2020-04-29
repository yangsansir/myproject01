package com.entities;

import java.io.Serializable;

/***
 * 车位类型表
 * @author yang
 */
@SuppressWarnings("serial")
public class CarType implements Serializable {
    private Integer id;
    private String CarTypeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarTypeName() {
		return CarTypeName;
	}
	public void setCarTypeName(String carTypeName) {
		CarTypeName = carTypeName;
	}
    
}
