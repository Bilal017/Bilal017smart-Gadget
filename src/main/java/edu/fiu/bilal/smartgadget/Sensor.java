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
public class Sensor implements SelfCheckCapable{
	private String type;
	private int range;
	private int size;
	
	public void detectMovement() {
		/**
		 * It can detect the movement of any object, let the processing unit to act accordingly. 
		 */
	} 
	public void detectSound() {
		/**
		 * It can detect the surrounding sounds to transmit the data to processing unit.
		 */
	}
	public void measureSpeed() {
		/**
		 * It can measure the speed of the vehicle.
		 */
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensor Activated";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.10);
	}
	

}
