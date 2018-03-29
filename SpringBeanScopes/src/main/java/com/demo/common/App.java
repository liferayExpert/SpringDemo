package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.CustomMessage;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/* Here you can See i requested two time for bean object of CustomMessage but it is only one object creating and same message for 
    	 * both object and also Constructor intializetion also one  time call it means spring default supported sigleton application if you want to 
    	 * create every time new object for new request of same class then you need to change the scope in xml prototype  
    	 *   
    	 *    In singleton, only a single instance per Spring IoC container, no matter how many time you retrieve it with getBean(),
    	 *     it will always return the same instance.
    	 *     
    	 *     
    	 *     If you want a new ‘customermessage’ bean instance, every time you call it, use prototype instead.
    	 *   */
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
    	CustomMessage programmerA=(CustomMessage)context.getBean("CustomMessage");
    	programmerA.setMessage("Message By programer A");
    	programmerA.getCustomMessage();
    	
    	CustomMessage programmerB=(CustomMessage)context.getBean("CustomMessage");
    	programmerB.getCustomMessage();
    }
}
