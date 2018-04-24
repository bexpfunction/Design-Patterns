/**
 * 
 */
package vehicle;

/**
 * @author Burak Yazar
 *
 */
public class GPSComponent extends CarComponentDecorator {

	Vehicle vehicle;
	/**
	 * 
	 */
	public GPSComponent(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/* (non-Javadoc)
	 * @see vehicle.CarComponentDecorator#getName()
	 */
	@Override
	public String getName() {
		return vehicle.getName() + ", with GPS";
	}

	/* (non-Javadoc)
	 * @see vehicle.Vehicle#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 200 + vehicle.getCost();
	}

}
