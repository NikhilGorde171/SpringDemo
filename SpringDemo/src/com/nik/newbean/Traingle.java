package com.nik.newbean;

public class Traingle {
	private String type;	//right click source->generate getters and setters select variable
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		
		System.out.println(getType()+"Traingle is drwan");
	}
	
}
