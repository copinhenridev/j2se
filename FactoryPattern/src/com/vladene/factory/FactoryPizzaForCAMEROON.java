/**
 * Concrete Factory for CAMEROON Pizza
 */
package com.vladene.factory;

import com.vladene.product.CameroonPizza;
import com.vladene.product.CheesePizza;
import com.vladene.product.MargheritePizza;
import com.vladene.product.Pizza;

/**
 * @author Vladene
 *
 */
public class FactoryPizzaForCAMEROON implements IFactoryPizza{

	@Override
	public Pizza factory(String pizzaType) {
	
		if(IFactoryPizza.CHEESEPIZZA.equals(pizzaType)) {
		   return new CheesePizza("CheezePiza Cook in CAMEROON mod");
		}else if (IFactoryPizza.MARGHERITEPIZZA.equals(pizzaType)) {
			 return new MargheritePizza("MargheritePizza Cook in CAMEROON mod");
		}else {
			return new CameroonPizza("CmaeroonPizza Cook in CAMEROON mod");
		}

	}
	
	
}