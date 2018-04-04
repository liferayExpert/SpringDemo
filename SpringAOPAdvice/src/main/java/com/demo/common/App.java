package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.CustomService;

/**
 *@author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
      
       System.out.println("=========BEFORE==========");
       
       CustomService beforadvice=(CustomService)context.getBean("customerServiceProxyforbefore");
       System.out.println("Advice :"+beforadvice);
       
       System.out.println("=========AFTER==========");
       CustomService afteradvice=(CustomService)context.getBean("customerServiceProxyforafterAdvice");
       System.out.println("Advice :"+afteradvice.getName());
       
       System.out.println("=========THROWEXCEPTION==========");
        
        CustomService exceptionadvice=(CustomService)context.getBean("customerServiceProxythrowExceptionAdvice");
        try {
        exceptionadvice.printThrowException();
    }catch(Exception e) {
    	
    }
    }
    
}
