package WebdriverCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E3_isMultiple_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here >> to select multiple options present in dropdpwn field  >> returns false 
    WebElement dropdownField = driver.findElement(By.id("drop1"));
    Select select = new Select(dropdownField);
    System.out.println(select.isMultiple());

    //Write code here >> to select multiple options present in multiselect field >> returns true
    WebElement multiselectdropdownField = driver.findElement(By.id("multiselect1"));
    Select select1 = new Select(multiselectdropdownField);
    System.out.println(select1.isMultiple());
    
    driver.quit();
    System.out.println("Browser Quit");
	}
}