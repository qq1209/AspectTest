 package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest {
	public static void main(String[] args){
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/spring/service/applicationContext.xml");
		AService aService=(AService) ctx.getBean("aService");
		aService.barA();
		aService.fooA("OK");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
}
