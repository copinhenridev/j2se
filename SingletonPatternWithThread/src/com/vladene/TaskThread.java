/**
 * This class allow to create real thread to test singleton pattern in multithrading environment
 */
package com.vladene;

/**
 * @author Vladene
 *
 */
public class TaskThread extends Thread{
	
	/**
	 * the name of thread using to display in log consol
	 */
	private String taskName;
	
	public TaskThread (String taskName) {
		super(taskName);
		this.taskName = taskName;
	}
	
    @Override
	public void run() {
		MySingleton instance = MySingleton.getInstance();
		instance.handle(taskName);
	}
	
}
