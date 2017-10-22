/**
 * Represent the Abstract Product in Factory Pattern 
 */
package com.vladene.product;

/**
 * @author Vladene
 *
 */
public abstract class Pizza {
	
	protected String description;
	
	public Pizza() {
		
	}

	/**
	 * techniques to cut Pizza before cooking
	 */
	public abstract void cut();

	/**
	 * techniques to cook
	 */
	public abstract void cook();

	/**
	 * techniques to pack Pizza before giving to customer
	 */
	public abstract void pack();
	
	
	public void describe() {
		System.out.println("Description: ["+description+"]");
	}
	

	
}
