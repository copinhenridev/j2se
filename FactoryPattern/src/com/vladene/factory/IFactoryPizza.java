/**
 * This class represent asbtract class/interface factory
 */
package com.vladene.factory;

import com.vladene.product.Pizza;

/**
 * @author Vladene
 *
 */
public interface IFactoryPizza {
	
	/**
	 * 
	 * @return the concrete Pizza
	 */
	public Pizza factory(String pizzaType);

	public String CAMEROONPIZZA="CAMEROONPIZZA";
	public String CHEESEPIZZA="CHEESEPIZZA";
	public String MARGHERITEPIZZA="MARGHERITEPIZZA";
	
}
