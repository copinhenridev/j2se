/**
 * 
 */
package business;

import dao.IDao;

/**
 * @author Vladene
 *
 */
public class BusinessComputation implements IBusiness {

	/**
	 * this attribute is use to get the value from database
	 */
	IDao dao;
	public double compute() {
		double result = 2 * dao.getValue();
		return result;
	}
	
	/**
	 * setter
	 * @param dao
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	
	
}
