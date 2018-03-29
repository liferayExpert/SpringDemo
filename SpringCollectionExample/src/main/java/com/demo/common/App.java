package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.PersonDetails;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
       PersonDetails personDetails=(PersonDetails) context.getBean("PersonDetails");
       System.out.println(personDetails);
    }
}
