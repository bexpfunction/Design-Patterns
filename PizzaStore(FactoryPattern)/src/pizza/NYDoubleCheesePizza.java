/**
 * 
 */
package pizza;

/**
 * @author Burak Yazar
 *
 */
public class NYDoubleCheesePizza extends Pizza {

	/**
	 * 
	 */
	public NYDoubleCheesePizza() {
		name = "New York Double";
		type = pizzaTypes.NYPepperoni;
		doughType = "Thick";
		toppings.add("Cheddar");
		toppings.add("Mosarella");
	}

}
