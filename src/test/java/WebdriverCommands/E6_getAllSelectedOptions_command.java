package WebdriverCommands;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E6_getAllSelectedOptions_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //Write code here >> To retrive all options in multiselect field which are selected
    WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
    Select select = new Select(multiSelectionBoxField);
    
     select.selectByVisibleText("Audi");
     select.selectByVisibleText("Volvo");
     select.selectByVisibleText("Hyundai");

    List<WebElement> selectedoptions = select.getAllSelectedOptions();
    
     for(WebElement option : selectedoptions) {
           
           System.out.println(option.getText());
    }
    
    driver.quit();
    System.out.println("Browser Quit");
	}
}