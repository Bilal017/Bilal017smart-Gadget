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
public class Gps implements SelfCheckCapable{
	private double mapVision;
	private int  currentLocation;
	private double latitude;
	private double longitude;
	
	public void navigate() {
		/**
		 * It helps in navigating the vehicle.
		 */
	}
	public void trackLocation() {
		/**
		 * it helps in tracking the vehicle current location.
		 */
	}
	public void saveLocation() {
		/**
		 * It will save the location of the old searches.
		 */
	}
	public void setDestination() {
		/**
		 * it will help us to reach the destination.
		 */
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "GPS Location Active";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.20);;
	}

}
