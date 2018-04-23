/**
 * 
 */
package behaviour;

/**
 * @author Burak Yazar
 *
 */
public class Squeak implements QuackBehaviour {

	/* (non-Javadoc)
	 * @see behaviour.QuackBehaviour#Quack()
	 */
	@Override
	public void Quack() {
		System.out.println("Squeak squeak!!!");
	}

}
