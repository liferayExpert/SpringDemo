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
    	  BeanDefination beanDef =(BeanDefination)context.getBean("BeanDef");
    	  try {
			beanDef.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 
    }
}
