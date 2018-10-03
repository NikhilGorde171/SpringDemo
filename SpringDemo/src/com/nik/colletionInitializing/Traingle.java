package com.nik.colletionInitializing;

import java.util.List;

public class Traingle {

	private List<Point> points;
	
	
	
	
	
	
public List<Point> getPoints() {
		return points;
	}






	public void setPoints(List<Point> points) {
		this.points = points;
	}






public void draw() {
		
		for(Point point:points) {
			
			System.out.println("Point A:("+point.getX()+","+point.getY()+")");

		}
	
		//System.out.println("Point:("+point.getX()+","+point.getY()+")");
		//System.out.println("Point B:("+getPointB().getX()+","+getPointB().getY()+")");
		//System.out.println("Point C:("+getPointC().getX()+","+getPointC().getY()+")");
	
	}
	
	
	
}
