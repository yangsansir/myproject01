package com.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class CheckUser implements Serializable {
	/**
	 * @author yang
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String checkUserNmae;// 验收员名字
	private  Set<CarPayment> carPaymentSet=new HashSet<CarPayment>();
	private  Set<BillOutBody> billOutBodySet=new HashSet<BillOutBody>();
	private  Set<SinglePayment> singlePaymentSet=new HashSet<SinglePayment>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCheckUserNmae() {
		return checkUserNmae;
	}
	public void setCheckUserNmae(String checkUserNmae) {
		this.checkUserNmae = checkUserNmae;
	}
	public Set<CarPayment> getCarPaymentSet() {
		return carPaymentSet;
	}
	public void setCarPaymentSet(Set<CarPayment> carPaymentSet) {
		this.carPaymentSet = carPaymentSet;
	}
	public Set<BillOutBody> getBillOutBodySet() {
		return billOutBodySet;
	}
	public void setBillOutBodySet(Set<BillOutBody> billOutBodySet) {
		this.billOutBodySet = billOutBodySet;
	}
	public Set<SinglePayment> getSinglePaymentSet() {
		return singlePaymentSet;
	}
	public void setSinglePaymentSet(Set<SinglePayment> singlePaymentSet) {
		this.singlePaymentSet = singlePaymentSet;
	}
	

	

}
