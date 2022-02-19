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
public class odometer extends Sensor implements SelfCheckCapable{
	private int size;
	private String type;
	private String design;
	
	public void measureRPM() {
		/**
		 * It will measure the RPM of the vehicle.
		 */
	}
	public void CheckDistance() {
		/**
		 * It will let us know the miles that a vehicle have traveled.
		 */
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Odometer";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.20);
	}

}
