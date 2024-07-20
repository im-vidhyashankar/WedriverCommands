package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D3_xpath_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here
    String xpath= driver.findElement(By.xpath("//button[@value='LogIn']")).getText();
    System.out.println("Located Xpath expression: "+ xpath);

  
    driver.close();
   
	}
}