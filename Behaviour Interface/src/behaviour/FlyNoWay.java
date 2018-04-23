package behaviour;
/**
 * Can't fly behaviour
 * @author Burak Yazar
 *
 */
public class FlyNoWay implements FlyBehaviour {

	/*
	 * Can't fly
	 * @see behaviour.FlyBehaviour#fly()
	 */
	@Override
	public void Fly() {
		System.out.println("I love to use my feet.");
	}

}
