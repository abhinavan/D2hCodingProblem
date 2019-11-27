package com.abhinavan.dto;

import java.util.List;

public class Features {
	private int featureId;
	private String packs;
	private List<Channel> channels;
	private List<Service> services;
	public int getFeatureId() {
		return featureId;
	}
	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}
	public String getPacks() {
		return packs;
	}
	public void setPacks(String packs) {
		this.packs = packs;
	}
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	
	

}
