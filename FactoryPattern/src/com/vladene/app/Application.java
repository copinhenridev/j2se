/**
 * Allow us to test Factory Design Pattern
 */
package com.vladene.app;

import com.vladene.factory.FactoryPizzaForCAMEROON;
import com.vladene.factory.FactoryPizzaForCANADA;
import com.vladene.factory.IFactoryPizza;
import com.vladene.restaurant.Restaurant;

/**
 * @author Vladene
 *
 */
public class Application {
	
	public static void main(String[] args) {
		
		//the special factory
		IFactoryPizza factoryPizzaForCANADA = new FactoryPizzaForCANADA();
		
		//construct the restaurant in CANADA 
		//not that this practice does not respect the Liskov subtitution technique
		Restaurant cameroonRestaurant = new Restaurant(factoryPizzaForCANADA);
		
		cameroonRestaurant.orderPizza(IFactoryPizza.MARGHERITEPIZZA);
	}

}
