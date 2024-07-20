package WebdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D7_getClass_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here -> To find class name of the 
    String driverObjectReferenceClass = driver.getClass().getSimpleName();
    
    System.out.println(driverObjectReferenceClass);
     driver.close();
	}
}