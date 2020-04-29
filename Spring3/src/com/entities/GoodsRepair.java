package com.entities;
import java.io.Serializable;
/*
 * 物品维修费
 */
@SuppressWarnings("serial")
public class GoodsRepair implements Serializable {
private Integer id;
private String goodsName;
private String reason;//维修原因
private double  repairCost;//维修费用
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public double getRepairCost() {
	return repairCost;
}
public void setRepairCost(double repairCost) {
	this.repairCost = repairCost;
}
}
