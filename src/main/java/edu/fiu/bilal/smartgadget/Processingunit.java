/**
 * 
 */
package edu.fiu.bilal.smartgadget;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Student
 *
 */
public class Processingunit implements SelfCheckCapable{
	private String type;
	private int size;
	private double version;
	private double memory;
	
	public void processData() {
		/**
		 * It will process the data comes from the sensors and GPS.
		 */
	}
	public void transmitData() {
		/**
		 * It will transmits data into useful information.
		 */
	}

	public void runDiagnostics() {
		/*
		 * Diagnosis the data 
		 */
	}
	public void autoPilot() {
		/**
		 * By using It we puts the car in the Autopilot mode.
		 */
	}
	public void autopark() {
		/**
		 * By using this we can put the vehicle into auto park mode and the car will be parked automatically>
		 */
	}
	public void checkDiagnostics() {
		/**
		 * With the help of this we can check Diagnostics of data.
		 */
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ProcessingUnit";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
