package com.abhinavan.dto;

public class Channel {
	private int channelId;
	private String channelName;
	private Double channelPrice;
	
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Double getChannelPrice() {
		return channelPrice;
	}
	public void setChannelPrice(Double channelPrice) {
		this.channelPrice = channelPrice;
	}
	
	@Override
	public String toString() {
		return channelId+" "+channelName+" "+channelPrice;
		
	}

}
