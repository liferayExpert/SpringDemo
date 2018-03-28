package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.impl.Rectangle;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
      Rectangle rectangle=(Rectangle)context.getBean("Rectangle");
      rectangle.draw();
    }
}
