package com.entities;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class YearReport implements Serializable{
	private Integer id;
	private int year;//年份
	private String yearPay;//年支出项
	private String yearIncome;//年收入项
	private double yearPayCount;//年总支出钱
	private double yearIncomeCount;//年总收入钱
	private Date createTime;
	private District district;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYearPay() {
		return yearPay;
	}
	public void setYearPay(String yearPay) {
		this.yearPay = yearPay;
	}
	public String getYearIncome() {
		return yearIncome;
	}
	public void setYearIncome(String yearIncome) {
		this.yearIncome = yearIncome;
	}
	public double getYearPayCount() {
		return yearPayCount;
	}
	public void setYearPayCount(double yearPayCount) {
		this.yearPayCount = yearPayCount;
	}
	public double getYearIncomeCount() {
		return yearIncomeCount;
	}
	public void setYearIncomeCount(double yearIncomeCount) {
		this.yearIncomeCount = yearIncomeCount;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
