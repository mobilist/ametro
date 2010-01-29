package com.ametro.model;

import java.io.Serializable;

public class ModelDescription implements Serializable {

	private static final long serialVersionUID = -7235384948740168505L;
	
	private String mMapName;
	private String mCountryName;
	private String mCityName;

	private int mWidth;
	private int mHeight;
	
	private long mTimestamp;
	private long mCrc;
	
	public ModelDescription(){
		super();
	}

	public ModelDescription(String mapName, String countryName, String cityName, int width, int height, long crc, long timestamp) {
		super();
		this.mMapName = mapName;
		this.mCountryName = countryName;
		this.mCityName = cityName;
		this.mWidth = width;
		this.mHeight = height;
		this.mCrc = crc;
		this.mTimestamp = timestamp;
	}

	public ModelDescription(Model model) {
		super();
		mMapName = model.getMapName();
		mCountryName = model.getCountryName(); 
		mCityName = model.getCityName(); 
		mWidth = model.getWidth(); 
		mHeight = model.getHeight();
		mCrc = model.getCrc();
		mTimestamp = model.getTimestamp();
	}

	public String getMapName() {
		return mMapName;
	}
	public void setMapName(String mapName) {
		this.mMapName = mapName;
	}
	public String getCountryName() {
		return mCountryName;
	}
	public void setCountryName(String countryName) {
		this.mCountryName = countryName;
	}
	public String getCityName() {
		return mCityName;
	}
	public void setCityName(String cityName) {
		this.mCityName = cityName;
	}
	public int getWidth() {
		return mWidth;
	}
	public void setWidth(int width) {
		this.mWidth = width;
	}
	public int getHeight() {
		return mHeight;
	}
	public void setHeight(int height) {
		this.mHeight = height;
	}
	public long getTimestamp() {
		return mTimestamp;
	}
	public void setTimestamp(long mTimestamp) {
		this.mTimestamp = mTimestamp;
	}
	public long getCrc() {
		return mCrc;
	}
	public void setCrc(long mCrc) {
		this.mCrc = mCrc;
	}

	public boolean completeEqual(ModelDescription model) {
		return locationEqual(model)
			&& mCrc == model.getCrc()
			&& mTimestamp == model.getTimestamp()
			;
	}

	public boolean locationEqual(ModelDescription model) {
		return mCountryName.equals(model.getCountryName()) 
			&& mCityName.equals(model.getCityName())
			;
	}


}
