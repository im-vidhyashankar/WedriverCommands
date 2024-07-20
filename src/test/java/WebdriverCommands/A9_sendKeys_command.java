package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_sendKeys_command {
	
    public static void main(String[] args) {
       
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get( "http://tutorialsninja.com/demo/index.php?route=account/login");
         driver.manage().window().maximize();
         
         driver.findElement(By.id("input-email")).sendKeys("testingvinu7@gmail.com");
         
         driver.findElement(By.id("input-password")).sendKeys("Testing@12345");
         
         driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
         
        
 }

}
