package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_id_Locator_command {
	
    public static void main(String[] args) {
       
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get( "http://omayo.blogspot.com/");
         driver.manage().window().maximize();
         
         driver.findElement(By.id("alert1"));
         System.out.println("Identified Element using iD");      

       
 }

}
