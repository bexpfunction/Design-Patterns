/**
 * 
 */
package duck;

import behaviour.FlyNoWay;
import behaviour.Squeak;

/**
 * @author Burak Yazar
 *
 */
public class RubberDuck extends Duck {

	public RubberDuck(){
		quackBehaviour = new Squeak();
		flyBehaviour = new FlyNoWay();
	}
	/* (non-Javadoc)
	 * @see duck.Duck#Display()
	 */
	@Override
	public void Display() {
		System.out.println("See, I made of rubber!");
	}

}
