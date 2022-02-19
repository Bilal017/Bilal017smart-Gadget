/*
 * 
 */
package edu.fiu.bilal.smartgadget;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Student
 *
 */
public class Battery implements SelfCheckCapable {
	private int size;  // size of the battery
	private int capacity;
	private String model;
	private int density;
	private int power;
		
	public void storesEnergy() {
	}
	// Helps to starts the vehicle initially
	public void startsvehicle() {
		
		}
	public void RunsVehicle() {
	
	}
		

	public void chargeVehicle() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.30);
	}
	}