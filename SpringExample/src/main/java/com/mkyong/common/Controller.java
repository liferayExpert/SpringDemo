package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Developer name using Spring Project!
 *
 */
public class Controller 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	DeveloperName obj = (DeveloperName) context.getBean("namebean");
        obj.nameofDeveloper();
        
    }
}
