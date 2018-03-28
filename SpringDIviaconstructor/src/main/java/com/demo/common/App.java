package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.helper.VehicleHelper;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
    	VehicleHelper vehicle=(VehicleHelper)context.getBean("VehicleHelper");
    	vehicle.getBikeType();
    }
}
