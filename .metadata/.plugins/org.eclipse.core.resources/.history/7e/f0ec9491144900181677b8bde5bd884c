/**
 * 
 */
package pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Burak Yazar
 *
 */
public abstract class Pizza {
	String name;
	String doughType = "Standart";
	List<String> toppings = new ArrayList<String>();
	
	void prepare(){
		System.out.println("Tossing the" + doughType + "...");
		System.out.println("Adding souces...");
		System.out.println("Adding ingredients...");
		for (String string : toppings) {
			System.out.println("Adding " + string + " topping.");
		}
	}
	
	void bake(){
		System.out.println("Pushing into the oven...");
		System.out.println("Waiting...");
		System.out.println("Baked!");
	}
	
	void serve(){
		System.out.println("Slicing...");
		System.out.println("Your " + name + " pizza is ready! Enjoy!");
	}
	
	String getName() { return this.name; }
}
