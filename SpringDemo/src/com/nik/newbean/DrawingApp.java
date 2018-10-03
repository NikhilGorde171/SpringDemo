//aim-making new obj and initializing property

package com.nik.newbean;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//general way to create obj
		//Traingle t1=new Traingle();
		//t1.draw();

		
		//using spring to create bean
		
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));-->giving an error type xmlBeanfactory is depricated
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/confipackage/firstbean.xml"); //Aplication Context Is sub-interfaceof BeanFactory 
		//for firstbean.xml not found exception-->need to make new package in com for the configuration files like here firstbean.xml
		//or without crating an extra package just move xml file in classpath i.e. src folder only.
		Traingle tribean=(Traingle)context.getBean("traingle");  //traingle is id reffered in spring.xml
		tribean.draw();
		
	}

}
