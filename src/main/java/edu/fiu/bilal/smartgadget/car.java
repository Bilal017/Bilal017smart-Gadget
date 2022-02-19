/**
 * 
 */
package edu.fiu.bilal.smartgadget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Student
 *
 */
public class car implements GenericComponent {
	
	private String brand;
	private int yearMake;
	private String Owenr;

	private Battery myBattery;
	private odometer myOdometer;
	private Sensor mySensor;
	private Object myGps;
	private Processingunit myProcessingunit;
	private ElectricMotor myElectricMotor;
	

	/**
	 * @param args
	 */
	
	public car() {
		myBattery = new Battery();
		myOdometer = new odometer();
		mySensor = new Sensor();
		myGps = new Gps();
		myProcessingunit = new Processingunit();
		myElectricMotor = new ElectricMotor();	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello come in, I am an automated car to give relax to your mind");
		
	}

	public void moveForward() {
		/** 
		 * It can move forward.
		 */
	}
	public void backWard() {
		/**
		 * it can move backward.
		 */
	}
	public void turnRight() {
		/**
		 * it can turn right.
		 */
	}
	public void turnLeft() {
		/**
		 * car can turn right.
		 */
	}
	public void Park() {
		/**
		 *  it can be park automatically or manually.
		 */
	}
	public void stop() {
		/**
		 * car can be stoped manually or automatically.
		 * 
		 */
	}
	public void carStatus() {
		/**
		 * it can show that in which status it is .
		 */
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Smart Gadget";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myBattery, myOdometer, mySensor, myGps, myProcessingunit, myElectricMotor); // add all your sub components
		return internalComponents;
	}
}
