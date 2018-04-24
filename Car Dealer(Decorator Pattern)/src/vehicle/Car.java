/**
 * 
 */
package vehicle;

/**
 * @author Burak Yazar
 *
 */
public class Car extends Vehicle {

	/**
	 * 
	 */
	public Car() {
		name = "Honda Motors";
	}

	/* (non-Javadoc)
	 * @see vehicle.Vehicle#getCost()
	 */
	@Override
	public int getCost() {
		return 20000;
	}

}
