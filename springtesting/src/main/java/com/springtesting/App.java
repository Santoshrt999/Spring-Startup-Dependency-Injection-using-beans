package com.springtesting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program explaing concepts of Spring dependency Injection //refrenced from
		// udemy..
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans.xml"); // you can also use
																					// ClassPathXMLApplication, but
																					// specify the Qualified Working
																					// directory location of the
																					// beans.xml file location
		Person p = (Person) ac.getBean("person");
		Address ad = (Address) ac.getBean("address");
		System.out.println(ad);
		p.speak();
		System.out.println(p);
		System.out.println(p.getTaxid());

	}

}
