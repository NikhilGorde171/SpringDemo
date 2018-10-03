package com.nik.injectingobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/confipackage/injectingObject.xml");
		
		Traingle tri=(Traingle)context.getBean("traingle");
		tri.draw();

	}

}
