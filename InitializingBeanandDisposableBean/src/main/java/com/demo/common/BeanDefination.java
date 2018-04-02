package com.demo.common;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanDefination implements InitializingBean, DisposableBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void destroy() throws Exception {
		System.out.println("After Spring container is Destroy "+message);
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method after properties are set :"+message);
		
	}
	

}
