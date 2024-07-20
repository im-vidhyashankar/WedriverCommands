package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E4_getFirstSelectedOption_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
    //dropdpown > Select options in multiselect dropdown in particular order and select first option in the list
    WebElement multiselectionBoxField = driver.findElement(By.id("multiselect1"));
    
    Select select = new Select(multiselectionBoxField);
    select.selectByVisibleText("Audi");
    select.selectByVisibleText("Volvo");
    select.selectByVisibleText("Hyundai");
    
    WebElement element = select.getFirstSelectedOption();
           
    System.out.println(element.getText());

   driver.quit();
   System.out.println("Browser Quit");
	}
}