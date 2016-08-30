package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest {
	public static void  main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/spring/aop/applicationContext.xml");  
	    Performer per=(Performer)ctx.getBean("DukePerformer");  
	    per.perform();  
	}
}
