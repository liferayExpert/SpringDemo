package com.demo.aspect;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExceptionAdvice implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("This Metho will execute after Throw exception !");
	}

}
