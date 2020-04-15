package com.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * 进货单头
 */
@SuppressWarnings("serial")
public class CarHoldBill implements Serializable {
	private Integer id;

	private  String  createTime;//时间

	private  Set<CarPayment> carPaymentSet=new HashSet<CarPayment>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	


	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	

	public Set<CarPayment> getCarPaymentSet() {
		return carPaymentSet;
	}

	public void setCarPaymentSet(Set<CarPayment> carPaymentSet) {
		this.carPaymentSet = carPaymentSet;
	}

	
	
}
