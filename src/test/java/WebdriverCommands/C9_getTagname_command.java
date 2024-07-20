package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C9_getTagname_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://omayo.blogspot.com/");
    driver.manage().window().maximize();
    
    //Write your code here
    String tagName = driver.findElement(By.id("alert1")).getTagName();
    
    System.out.println(tagName);
    
     driver.quit();
   
	}
}