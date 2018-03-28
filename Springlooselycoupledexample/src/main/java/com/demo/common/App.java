package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.helper.OutPutHelper;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Common.xml");
       System.out.println("xml intiliazation done here ");
       OutPutHelper output=(OutPutHelper)context.getBean("OutPutHelper");
       output.getoutputInformation();
    }
}
