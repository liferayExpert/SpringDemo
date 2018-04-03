package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )  
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
    	Customer customer=(Customer)context.getBean("CustomerBean");
    	System.out.println("Customer Details :="+customer);
 
    	/*use SpEL to inject values into property*/
    	ApplicationContext context1=new ClassPathXmlApplicationContext("Spring-Bean.xml");
    	College college=(College)context1.getBean("collegeBean");
    	System.out.println("College Details :"+college);
    	
}
}
