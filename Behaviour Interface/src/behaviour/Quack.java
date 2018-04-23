/**
 * 
 */
package behaviour;

/**
 * Quacking
 * @author Burak Yazar
 *
 */
public class Quack implements QuackBehaviour {

	/* 
	 * @see behaviour.QuackBehaviour#Quack()
	 */
	@Override
	public void Quack() {
		System.out.println("Quack quack...");
	}

}
