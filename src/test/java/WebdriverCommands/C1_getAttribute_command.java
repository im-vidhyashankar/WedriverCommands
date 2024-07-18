package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C1_getAttribute_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
 
  //Write code here
    String textOnButton = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("value");
    System.out.println("The text of the button is : " +textOnButton );
    
    driver.quit();
    
    
	}
}
