package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.demo.model.Maths;
import com.demo.model.Science;

@Aspect
public class LoggingAspect {
	
	@Before("allgetters()")
	public void loggingAdvicer()
	{
		System.out.println("Logging Advicer is running before target :");
	}
	
	@Before("allgetters()")
	public void loggingAdvicer1()
	{
		System.out.println("Logging1 Advicer is running before target :");
	}
	
	@Pointcut("execution(public * get*())")
     public void allgetters() {
	}	
}



