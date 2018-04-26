/**
 * 
 */
package pizza;

/**
 * @author Burak Yazar
 *
 */
public class ChicagoSpicyPizza extends Pizza {

	/**
	 * 
	 */
	public ChicagoSpicyPizza() {
		type = pizzaTypes.ChicagoSpicy;
		name = "Chicago Spice";
		doughType = "Thin";
		toppings.add("Chicken Pieces");
		toppings.add("Black Pepper");
		toppings.add("Curry");
		toppings.add("Mosarella");
	}

}
