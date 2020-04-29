package com.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * ס商品入库单头
 */
@SuppressWarnings("serial")
public class HouseHoldBill implements Serializable {
	private Integer id;
	private  String createTime;//时间
	
	private Set<SinglePayment>  singlePaymentSet=new HashSet<SinglePayment>();//�����
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
	
	public Set<SinglePayment> getSinglePaymentSet() {
		return singlePaymentSet;
	}
	public void setSinglePaymentSet(Set<SinglePayment> singlePaymentSet) {
		this.singlePaymentSet = singlePaymentSet;
	}
	
	

}
