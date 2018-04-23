/**
 * 
 */
package behaviour;

/**
 * @author Burak Yazar
 *
 */
public class FlyWithWings implements FlyBehaviour {

	/*
	 * Flying implemention from interface FlyBehaviour
	 * @see behaviour.FlyBehaviour#fly()
	 */
	@Override
	public void Fly() {
		System.out.println("Flapping wings!!!");
	}
	
}
