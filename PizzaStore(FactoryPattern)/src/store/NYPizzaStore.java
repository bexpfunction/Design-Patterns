/**
 * 
 */
package store;

import pizza.NYDoubleCheesePizza;
import pizza.NYPepperoniPizza;
import pizza.Pizza;
import pizza.pizzaTypes;

/**
 * @author Burak Yazar
 *
 */
public class NYPizzaStore extends PizzaStore {

	/**
	 * 
	 */
	public NYPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see store.PizzaStore#createPizza(pizza.pizzaTypes)
	 */
	@Override
	protected Pizza createPizza(pizzaTypes type) {
		switch (type) {
		case NYDoubleCheese:
			return new NYDoubleCheesePizza();
		case NYPepperoni:
			return new NYPepperoniPizza();
		default:
			return new NYDoubleCheesePizza();
		}
	}

}
