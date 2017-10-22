/**
 * MargheritePizza concrete class
 */
package com.vladene.product;

import com.vladene.utils.Utils;

/**
 * @author Vladene
 *
 */
public class CameroonPizza extends Pizza   {
	
	public CameroonPizza(String description) {
		
		super.description = description;
		
		describe();
	}

	@Override
	public void cut() {
		Utils.log("Cut in 2 parts. Not exeed 50s");
	}

	@Override
	public void cook() {
		Utils.log("Cook by adding chicken, mouse, white pepper, olive oil. Not exeed 3 minutes");
	}

	@Override
	public void pack() {
		Utils.log("Pack in banana leaf");
	}

	
}
