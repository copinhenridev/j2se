/**
 * This class show the way to implement Injection Of Control using springIOC
 * dynamicaly instanciation
 */
package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.IBusiness;
import dao.IDao;
import utils.Utils;

/**
 * @author Vladene
 *
 */
public class ViewConsoleApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contextSpring = null;
		try {
			contextSpring = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
			IBusiness business = (IBusiness) contextSpring.getBean("business");
			Utils.log("Result comming form business layer using IOC from scratch = "+business.compute());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			contextSpring.close(); 
		}
		
	}

}
