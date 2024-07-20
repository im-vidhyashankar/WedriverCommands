package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_findElement_command {

	public static void main(String[] args) {
       
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get( "http://omayo.blogspot.com/");
         driver.findElement(By.id( "ta1"));
       
 }

}
