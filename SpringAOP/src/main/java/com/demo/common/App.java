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
        Subject subject=(Subject)context.getBean("subject");
        System.out.println("Total subject we have : "+subject.getScience().getBookName());
    }
}
