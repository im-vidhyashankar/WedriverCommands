package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C2_isDisplayed_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
 
    //Write code here
   
    boolean a = driver.findElement(By.id("but2")).isDisplayed();
    boolean b = driver.findElement(By.id("hbutton")).isDisplayed();
  	System.out.println(a );
  	System.out.println(b );
   
    driver.quit();
    
	}
}
