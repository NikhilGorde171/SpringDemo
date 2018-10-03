package com.nik.colletionInitializing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DraeingApp {

	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/confipackage/collectionINI.xml");
		
		Traingle tri=(Traingle)context.getBean("traingle");
		tri.draw();

		
	}

}
