/**
 * CheezePizza concrete class
 */
package com.vladene.product;

import com.vladene.utils.Utils;

/**
 * @author Vladene
 *
 */
public class CheesePizza extends Pizza   {
	
	public CheesePizza(String description) {
		
		super.description = description;
		
		describe();
	}

	@Override
	public void cut() {
		Utils.log("Cut in 5 parts. Not exeed 30 s");
	}

	@Override
	public void cook() {
		Utils.log("Cook by adding ingredient of Sicilia. Not exeed 10 minutes");
	}

	@Override
	public void pack() {
		Utils.log("Pack in aluminium foila");
	}
	
	
}
