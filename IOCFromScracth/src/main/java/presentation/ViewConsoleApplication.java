/**
 * This class show the way to implement Injection Of Control from scratch using
 * dynamicaly instanciation
 */
package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import business.IBusiness;
import dao.IDao;
import utils.Utils;

/**
 * @author Vladene
 *
 */
public class ViewConsoleApplication {
	
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("config.txt"));
			String classDaoName = scan.next();
			String classBusinessName = scan.next();
			
			IDao dao = (IDao) Class.forName(classDaoName).newInstance();
			
			IBusiness business = (IBusiness) Class.forName(classBusinessName).newInstance();
			
			Method methodCompute = Class.forName(classBusinessName).getMethod("setDao", new Class[] {IDao.class});
			
			methodCompute.invoke(business, new Object[] {dao});
			
			Utils.log("Result comming form business layer using IOC from scratch = "+business.compute());
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}finally{
			scan.close();
		}
		
	}

}
