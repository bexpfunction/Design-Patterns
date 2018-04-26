/**
 * 
 */
package store;

import pizza.Pizza;
import pizza.pizzaTypes;

/**
 * @author Burak Yazar
 *
 */
public abstract class PizzaStore {
	public Pizza orderPizza(pizzaTypes type){
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.serve();
		
		return pizza;
	}
	protected abstract Pizza createPizza(pizzaTypes type);
}
