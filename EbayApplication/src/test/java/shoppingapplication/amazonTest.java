package shoppingapplication;
import shoppingapplication.openApp;

public class amazonTest {
 
	public static void main(String[] args) {
		try {
			openApp.openApplication();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
