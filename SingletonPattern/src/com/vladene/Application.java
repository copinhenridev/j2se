/**
 * This class show how to execute singleton pattern
 */
package com.vladene;

/**
 * @author Vladene
 *
 */
public class Application {
	
	public static void main(String[] args) {
		
		for (int i= 1; i<4; i++) {
			MySingleton instance = MySingleton.getInstance();
			instance.handle("Task_"+i);
		}
		
	}

}
