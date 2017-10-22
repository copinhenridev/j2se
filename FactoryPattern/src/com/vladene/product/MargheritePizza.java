/**
 * MargheritePizza concrete class
 */
package com.vladene.product;

import com.vladene.utils.Utils;

/**
 * @author Vladene
 *
 */
public class MargheritePizza extends Pizza   {
	
	public MargheritePizza(String description) {
		
		super.description = description;
		
		describe();
	}

	@Override
	public void cut() {
		Utils.log("Cut in 3 parts. Not exeed 10 s");
	}

	@Override
	public void cook() {
		Utils.log("Cook by adding ingredient of tomato, olive oil. Not exeed 5 minutes");
	}

	@Override
	public void pack() {
		Utils.log("Pack in cardboard");
	}
	
	
}
