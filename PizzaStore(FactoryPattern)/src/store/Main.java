/**
 * 
 */
package store;

import pizza.pizzaTypes;

/**
 * @author Burak Yazar
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore chicago = new ChicagoPizzaStore();
		PizzaStore newYork = new NYPizzaStore();
		
		chicago.orderPizza(pizzaTypes.ChicagoFullMeat);
		newYork.orderPizza(pizzaTypes.NYPepperoni);

	}

}
