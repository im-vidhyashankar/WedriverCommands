package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Dimension;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A4_setSize_command {
	
    public static void main(String[] args) {
      
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         Dimension d = new Dimension(300,650);
         driver.manage().window().setSize(d); // Use setzise and pass constructor
       
 }

}
