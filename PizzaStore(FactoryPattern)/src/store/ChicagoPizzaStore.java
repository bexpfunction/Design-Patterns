/**
 * 
 */
package store;

import pizza.ChicagoFullMeatPizza;
import pizza.ChicagoSpicyPizza;
import pizza.Pizza;
import pizza.pizzaTypes;

/**
 * @author Burak Yazar
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	/**
	 * 
	 */
	public ChicagoPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see store.PizzaStore#createPizza(pizza.pizzaTypes)
	 */
	@Override
	protected Pizza createPizza(pizzaTypes type) {
		switch (type) {
		case ChicagoFullMeat:
			return new ChicagoFullMeatPizza();
		case ChicagoSpicy:
			return new ChicagoSpicyPizza();
		default:
			return new ChicagoFullMeatPizza();
		}
	}

}