package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1_getSize_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://tutorialsninja.com/demo/");
    driver.manage().window().maximize();
    
    //Write your code here
    Dimension d = driver.findElement(By.name("search")).getSize();
    
    System.out.println("Height of search box field is: "+d .height);
    System.out.println("Width of search box field is: "+d .width);
    
     driver.quit();
   
	}
}