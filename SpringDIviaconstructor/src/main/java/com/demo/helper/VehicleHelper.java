package com.demo.helper;

import com.demo.baseImpl.Vehicle;

public class VehicleHelper {
	
	
	Vehicle vehicle;
	
	public void getBikeType() {
		vehicle.vehicleType();
	}

	public VehicleHelper(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	

}
