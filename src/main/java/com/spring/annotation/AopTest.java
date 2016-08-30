package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.spring.aop.Performer;
import com.spring.service.AService;

public class AopTest {
	public static void  main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/spring/annotation/applicationContext.xml");  
		AService aService=(AService) ctx.getBean("aService");
		aService.barA();    
	}
}
