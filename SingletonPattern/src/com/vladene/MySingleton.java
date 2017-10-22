package com.vladene;

/**
 * This class represent the singleton class
 * @author Vladene
 *
 */
public class MySingleton {

	/**
	 * represent the instance of our class
	 */
	private static final MySingleton instance;
	
	/**
	 * use to count the number of increment
	 */
	private int counter;
	
	
	static{
		instance = new MySingleton();
	}
	
	
	/**
	 * This constructor has to be private do deny instaciation.
	 * It's the default constructor has not defined private, the constructor must
	 * define it public by default
	 */
	private MySingleton() {
		
		System.out.println("Instaciation of class "+"["+ MySingleton.class.getSimpleName() +"]");
	
	}
	
	
	/**
	 * This is the only method which allow to get reference to a unique instance of MySongleton class
	 */
	public static MySingleton getInstance() {
	
		return instance;
	}
	
	
	/**
	 * 
	 * @param taskName  the name of execution task
	 */
	public void handle(String taskName) {
		
		System.out.println("************ Begin of treatement of task "+"["+taskName+"]"+ " value of COUNTER :"+counter);
		// simulate long treatment
		for(int i =1; i<3; i++) {
			counter++;
			System.out.println("COUNTER increment value :"+counter);
			try {
				//simulation of long treatment of 1s
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of treatement of task "+"["+taskName+"]"+ " Value of COUNTER : "+counter);
		
	}
	
}
