package com.demo.helper;

import com.demo.output.OutPutInformation;

public class OutPutHelper {
	
	OutPutInformation outputinformation;
	
	public void getoutputInformation() {
		
		outputinformation.generateOutput();
		
	}
	public void setOutputinformation(OutPutInformation outputinformation) {
		this.outputinformation = outputinformation;
	}
	
	

}
