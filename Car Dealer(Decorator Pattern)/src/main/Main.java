/**
 * 
 */
package main;

import vehicle.ABSComponent;
import vehicle.Car;
import vehicle.GPSComponent;
import vehicle.Vehicle;

/**
 * Simple car dealer system which uses Decorator Pattern
 * @author Burak Yazar
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle oldHonda = new Car();
		
		Vehicle newHonda = new Car();
		newHonda = new ABSComponent(newHonda);
		newHonda = new GPSComponent(newHonda);
		/*newHonda is wrapped with GPSComponent and ABSComponent*/
		
		System.out.println(oldHonda.getName() + " || " + oldHonda.getCost());
		System.out.println(newHonda.getName() + " || " + newHonda.getCost());
	}

}
