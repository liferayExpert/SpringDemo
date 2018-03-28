package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.helper.ShapeHelper;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main(String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
      ShapeHelper rectangle=(ShapeHelper)context.getBean("ShapeHelper");
      rectangle.getShape();
    }
}
