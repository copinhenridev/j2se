/**
 * This class is a segond version of class DaoImpl. 
 * It implements the fact that the code will be close on modification but 
 * open in extension. 
 * The config file will be updated to modify the fact that the customer wan to change
 * the feature
 */
package ex;

import dao.IDao;

/**
 * @author Vladene
 *
 */
public class DaoImplExt implements IDao {

	public double getValue() {
		
		return 1500;
	}

}
