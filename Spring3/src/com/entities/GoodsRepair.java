package com.entities;
import java.io.Serializable;
/*
 * ��Ʒά�޷�
 */
@SuppressWarnings("serial")
public class GoodsRepair implements Serializable {
private Integer id;
private String goodsName;
private String reason;//ά��ԭ��
private double  repairCost;//ά�޷���
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
