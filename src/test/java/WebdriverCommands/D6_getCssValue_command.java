package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D6_getCssValue_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here -> To find css property value to identify the any button
    String lineHeight = driver.findElement(By.id("home")).getCssValue("line-height");
    
    System.out.println(lineHeight);
    
     driver.close();
	}
}