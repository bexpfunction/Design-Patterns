/**
 * 
 */
package pizza;

/**
 * @author Burak Yazar
 *
 */
public class NYPepperoniPizza extends Pizza {

	/**
	 * 
	 */
	public NYPepperoniPizza() {
		type = pizzaTypes.NYPepperoni;
		name = "New York Pepperoni";
		doughType = "Thin";
		toppings.add("Pepperoni");
		toppings.add("Mosarella");
	}

}
