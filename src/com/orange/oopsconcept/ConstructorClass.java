package com.orange.oopsconcept;

public class ConstructorClass {
	private String myDevice;
	private String myDeviceModel;
	private int myDeviceCost;
	
	public ConstructorClass() {
		System.out.println("FIRST Execute the Default Constructor Class");
		System.out.println(myDevice + " " + myDeviceModel +" " +myDeviceCost);
	}

	public String getMyDevice() {
		return this.myDevice;
	}
	public void setMyDevice(String myDevice) {
		this.myDevice = myDevice;
	}
	public String getMyDeviceModel() {
		return this.myDeviceModel;
	}
	public void setMyDeviceModel(String myDeviceModel) {
		this.myDeviceModel = myDeviceModel;
	}
	public int getMyDeviceCost() {
		return myDeviceCost;
	}
	public void setMyDeviceCost(int myDeviceCost) {
		this.myDeviceCost = myDeviceCost;
	}
	
}
