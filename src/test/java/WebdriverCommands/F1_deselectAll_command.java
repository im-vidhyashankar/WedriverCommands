package WebdriverCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F1_deselectAll_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here >> To deselect all options present in multiselect field which are selected
    	WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
    	Select select = new Select(multiSelectionBoxField);
    	select.selectByVisibleText("Swift");
    	select.selectByVisibleText("Audi");
    	select.selectByVisibleText("Volvo");
    	select.selectByVisibleText("Hyundai");

     Thread.sleep(3000);
     
     select.deselectAll();
    
    driver.quit();
    System.out.println("Browser Quit");
	}
}