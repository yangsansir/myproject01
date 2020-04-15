package com.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * ס商品出库单头
 */
@SuppressWarnings("serial")
public class BillOutHead implements Serializable {
	private Integer id;
	
	private  String createTime;//时间
	
	private Set<BillOutBody>  billOutBodySet=new HashSet<BillOutBody>();//
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
	
	public Set<BillOutBody> getBillOutBodySet() {
		return billOutBodySet;
	}
	public void setBillOutBodySet(Set<BillOutBody> billOutBodySet) {
		this.billOutBodySet = billOutBodySet;
	}

	
	

}
