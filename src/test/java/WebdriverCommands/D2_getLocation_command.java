package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D2_getLocation_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here
   Point point = driver.findElement(By.id("ta1")).getLocation();
   
   System.out.println("Height of the text area field is: "+point.x);
   
   System.out.println("Width of the text area field is: "+point.y);
   
    driver.close();
   
	}
}