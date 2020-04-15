package com.entities;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class MonthReport implements Serializable{
	private Integer id;
	private int month;//�·�
	private String monthPay;//��֧����
	private String monthIncome;//��������
	private double monthPayCount;//֧��Ǯ
	private double monthIncomeCount;//����Ǯ
	private Date createTime;
	private District district;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(String monthPay) {
		this.monthPay = monthPay;
	}
	public String getMonthIncome() {
		return monthIncome;
	}
	public void setMonthIncome(String monthIncome) {
		this.monthIncome = monthIncome;
	}
	public double getMonthPayCount() {
		return monthPayCount;
	}
	public void setMonthPayCount(double monthPayCount) {
		this.monthPayCount = monthPayCount;
	}
	public double getMonthIncomeCount() {
		return monthIncomeCount;
	}
	public void setMonthIncomeCount(double monthIncomeCount) {
		this.monthIncomeCount = monthIncomeCount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
}
