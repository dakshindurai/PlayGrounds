package com.orange.oopsconcept;

public class DefaultConstructorPracticeClass {
	// Class Variables 
	private String myDevice;
	private String myDeviceModel;
	private String myDeviceVersion;
	
	// Default Constructor gets initialized when object is created
	public DefaultConstructorPracticeClass() {
		System.out.println("Default Constructor Class");
		System.out.println("My Device "+ myDevice + " My Device Model "+ myDeviceModel + " My Device Version " + myDeviceVersion);
	}

	// getters and setters to set and get the values of variables
	public String getMyDevice() {
		return myDevice;
	}

	public void setMyDevice(String myDevice) {
		this.myDevice = myDevice;
	}

	public String getMyDeviceModel() {
		return myDeviceModel;
	}

	public void setMyDeviceModel(String myDeviceModel) {
		this.myDeviceModel = myDeviceModel;
	}

	public String getMyDeviceVersion() {
		return myDeviceVersion;
	}

	public void setMyDeviceVersion(String myDeviceVersion) {
		this.myDeviceVersion = myDeviceVersion;
	}
		
}
