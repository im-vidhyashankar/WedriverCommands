package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C8_submit_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("testing@gmail.com");
    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Testing");
   //Above credentials are dummy
    
    Thread.sleep(3000);
   
    driver.findElement(By.id("input-password")).submit();
    System.out.println(" Clicking on submit button and closing browser");

    driver.quit();
    
	}
}