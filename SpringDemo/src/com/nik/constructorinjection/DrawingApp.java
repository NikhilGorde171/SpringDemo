//aim-constructor injection from configuration file
package com.nik.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.constructorinjection.Traingle;

public class DrawingApp {

	public static void main(String[] args) {
		


		ApplicationContext context=new ClassPathXmlApplicationContext("com/confipackage/constructorinjection.xml"); //Aplication Context Is sub-interfaceof BeanFactory 
		
		Traingle tribean=(Traingle)context.getBean("traingle");  
		tribean.draw();
		tribean.draw1();
		
	}

}
