package com.may.fifteen.visitor;

	public interface VehicleInspector {  
		    int visit(Car car);  
		    int visit(Van van);  
		    int visit(MotorBike motorbike);
			int visit1(MotorBike motorbike);  
		 
}
