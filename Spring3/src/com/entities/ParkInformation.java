package com.entities;

/***
 * ��λ��Ϣ��
 * 
 * @author yang
 */
public class ParkInformation {
	private Integer id;
	private String OwnerName;// ��������
	private String LicensePlate;// ���ƺ�
	private String districtName;//С����
	private String location;// ��λ��ַ
	private  CarType carType;// ��λ����

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getLicensePlate() {
		return LicensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
