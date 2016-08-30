package com.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {
	public void doBefore(JoinPoint jp){
		System.out.println("log Bagining method:"+jp.getTarget().getClass().getName()+"."+
				jp.getSignature().getName());
	}
	
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		long time=System.currentTimeMillis();
		Object retVal=pjp.proceed();
		time=System.currentTimeMillis()-time;
		System.out.println("process time: "+time);
		return retVal;
	}
	
	public void doAfter(JoinPoint jp){
		System.out.println("log Ending method:"+jp.getTarget().getClass().getName()+"."+jp.getSignature().getName());
	}
	
	public void doThrowing(JoinPoint jp,Throwable ex){
		System.out.println("method "+jp.getTarget().getClass().getName());
		System.out.println(ex.getMessage());
	}
}
