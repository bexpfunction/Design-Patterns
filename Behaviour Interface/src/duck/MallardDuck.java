/**
 * 
 */
package duck;

import behaviour.FlyWithWings;
import behaviour.Quack;

/**
 * @author Burak Yazar
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck(){
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	/* (non-Javadoc)
	 * @see duck.Duck#Display()
	 */
	@Override
	public void Display() {
		System.out.println("See, I'm a Mallard!");
	}

}
