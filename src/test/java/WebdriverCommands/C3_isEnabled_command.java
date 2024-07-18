package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C3_isEnabled_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
 
    //Write code here
   
    boolean enabledButton = (driver.findElement(By.xpath("//*[@id='but2']")).isEnabled());
    boolean disabledButton = (driver.findElement(By.xpath("//*[@id='but1']")).isEnabled());
    System.out.println("Checking button is enabled or not and the output is : "+enabledButton);
    System.out.println("Checking button is enabled or not and the output is : "+disabledButton);
    
    
    driver.quit();
    
	}
}
