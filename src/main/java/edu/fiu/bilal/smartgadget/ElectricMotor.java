/**
 * 
 */
package edu.fiu.bilal.smartgadget;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Student
 *
 */
public class ElectricMotor implements SelfCheckCapable {
	private int motorCapacity;
	private String motorType;
	private int efficiency;
	private int power;
	
	public void generatePower() {
		/**
		 * it will generate power to run the vehicle.
		 */
	}
	public void stepupVehicle() {
		/**
		 * It can move the vehicle faster.
		 */
	}
	public void slackDown() {
		/**
		 * it can slowdown the vehicle.
		 */
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Electric Motor Running";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.10);
	}
}
