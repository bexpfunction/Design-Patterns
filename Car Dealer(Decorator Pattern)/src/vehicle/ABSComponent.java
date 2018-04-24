/**
 * 
 */
package vehicle;

/**
 * @author Burak Yazar
 *
 */
public class ABSComponent extends CarComponentDecorator {
	Vehicle vehicle;
	/**
	 * 
	 */
	public ABSComponent(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/* (non-Javadoc)
	 * @see vehicle.CarComponentDecorator#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return vehicle.getName() + ", with ABS";
	}

	/* (non-Javadoc)
	 * @see vehicle.Vehicle#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 450 + vehicle.getCost();
	}

}
