package WebdriverCommands;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E5_getOptions_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here >> To retrive all options in dropdwn field 
    WebElement dropdownField = driver.findElement(By.id("drop1"));
    Select select = new Select(dropdownField);
    System.out.println(select.isMultiple());

    List<WebElement> options = select.getOptions();
    
    for(WebElement option : options) {
          
          System.out.println(option.getText());
          
   }
    
    driver.quit();
    System.out.println("Browser Quit");
	}
}