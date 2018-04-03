package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.demo.model.Maths;
import com.demo.model.Science;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getBookName())")
	public void loggingAdvicer()
	{
		System.out.println("Logging Advicer is running before target :");
	}

}
