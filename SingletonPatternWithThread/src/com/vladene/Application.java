package com.vladene;
/**
 * This class show how to execute singleton pattern
 */


/**
 * @author Vladene
 *
 */
public class Application {
	
	public static void main(String[] args) {
		
		for (int i= 1; i<=4; i++) {
			TaskThread task = new TaskThread("Task_"+i);
			task.start();
		}
		
	}

}
