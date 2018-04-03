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
      ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Bean.xml");
     Person person= (Person)context.getBean("person");
     System.out.println("Person Details : "+person);
    }
}
