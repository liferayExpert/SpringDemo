package com.demo.common;

import com.demo.model.Maths;
import com.demo.model.Science;

public class Subject {
	private Maths maths;
	private Science science;
	public Maths getMaths() {
		return maths;
	}
	public void setMaths(Maths maths) {
		this.maths = maths;
	}
	public Science getScience() {
		return science;
	}
	public void setScience(Science science) {
		this.science = science;
	}
	@Override
	public String toString() {
		return "Subject [maths=" + maths + ", science=" + science +"]";
	}
	
	

}
