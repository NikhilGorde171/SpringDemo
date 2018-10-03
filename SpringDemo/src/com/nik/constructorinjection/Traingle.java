package com.nik.constructorinjection;

public class Traingle {

	private String type;
	public String getType1() {
		return type1;
	}

	public int getHeight1() {
		return height1;
	}
	private int height;
	
	//for const which accept two values
	private String type1;
	private int height1;
	
	
	public Traingle(String t1) {			
		
		this.type=t1;
	}
	
	public Traingle(int h1) {			
		
		this.height=h1;
	}
	
	public Traingle(String s1,int h2)
	{
		this.type1=s1;
		this.height1=h2;
		
	}
	//only getters since setting from constructor
	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}

	public void draw() {
		
		System.out.println(getType()+"Traigle is built with height"+getHeight());
	}
public void draw1() {
		
		System.out.println(getType1()+"Traigle is built with height"+getHeight1());
	}

}
