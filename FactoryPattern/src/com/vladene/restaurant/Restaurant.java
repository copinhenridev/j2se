/**
 * 
 */
package com.vladene.restaurant;

import com.vladene.factory.IFactoryPizza;
import com.vladene.product.Pizza;

/**
 * @author Vladene
 *
 */
public class Restaurant {

	IFactoryPizza factoryPizza;
	
	public Restaurant(IFactoryPizza factoryPizza) {
		this.factoryPizza = factoryPizza;
	}
	
	public Pizza orderPizza(String pizzaType) {
		Pizza pizzaOrder = factoryPizza.factory(pizzaType);
		
		pizzaOrder.cut();
		pizzaOrder.cook();
		pizzaOrder.pack();
		
		return pizzaOrder;
	}
}
