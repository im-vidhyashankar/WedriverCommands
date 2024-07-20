package WebdriverCommands;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D8_getWindowHandle_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here
   
    String firstWindow = driver.getWindowHandle();
    System.out.println("First window handle ID is :" + firstWindow);
    
    driver.findElement(By.linkText("Open a popup window")).click();
    System.out.println("Clicking on another window");
    
    Set<String> secondWindow = driver.getWindowHandles();
    System.out.println("Second window handle ID is :" + secondWindow);
    Thread.sleep(3000);
    
    Iterator<String> itr = secondWindow.iterator();
    while(itr.hasNext()) {
    	String window = itr.next();
    	driver.switchTo().window(window);
    	 if(driver.getTitle().equals("New Window"))
    	 {		
    	   driver.close(); 
    	 }
    	  Thread.sleep(3000);
    	  driver.switchTo().window(firstWindow);
    	  driver.findElement(By.name("q")).sendKeys("Vidhya Shankar");    	 
    }
    driver.quit();
	}
}