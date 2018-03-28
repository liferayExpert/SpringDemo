package com.demo.helper;

import com.demo.baseImpl.Shape;

public class ShapeHelper {
	
	Shape shape;
	
	public void getShape() {
		
		shape.draw();
	}
	
       /* Using setter inject DI*/
	
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
