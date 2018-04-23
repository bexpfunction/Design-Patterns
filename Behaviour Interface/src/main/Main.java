package main;

import behaviour.FlyNoWay;
import duck.Duck;
import duck.MallardDuck;
import duck.RubberDuck;

/*
 * This application implements The Duck Problem
 * 
 * @author Burak Yazar
 */
public class Main {
	/*
	 * Creates main application object
	 */
	public Main(){
		
	}
	
	/*
	 * Application init point
	 */
	public static void main(String[] args){
		System.out.println("Hello patterns...");
		
		/*
		 * Temp mallord duck
		 */
		Duck theMallord = new MallardDuck();
		theMallord.performQuack();
		theMallord.performFly();
		
		/*
		 * Temp rubber duck
		 */
		Duck theRubber = new RubberDuck();
		theRubber.performQuack();
		theRubber.performFly();
		
	}
}
