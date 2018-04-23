package duck;
/**
 * The Duck superclass
 * 
 * @author Burak Yazar
 *
 */

import behaviour.FlyBehaviour;
import behaviour.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck(){
		
	}

	/*
	 * Make these behaviours dynamic
	 */
	public void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	public void setQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;
	}
	
	/*
	 * All ducks will be displayed eventually but using different properties.
	 * So every duck object will have to implement Display method themselves.
	 */
	public abstract void Display();
	
	/*
	 * Teach these ducks how to fly
	 */
	public void performFly(){
		flyBehaviour.Fly();
	}
	
	/*
	 * Teach these ducks how to quack
	 */
	public void performQuack(){
		quackBehaviour.Quack();
	}
	
	/*
	 * All ducks can swim.
	 */
	public void Swim(){
		System.out.println("All ducks swim!");
	}
}
