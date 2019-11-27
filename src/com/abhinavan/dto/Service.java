package com.abhinavan.dto;

public class Service {
	private int id;
	private String serviceName;
	private Double servicePrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(Double servicePrice) {
		this.servicePrice = servicePrice;
	}
	
	@Override
	public String toString() {
		return id+" "+serviceName+" "+servicePrice;
	}

}
