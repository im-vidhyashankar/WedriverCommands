package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2_selectByValue_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://omayo.blogspot.com/");
    
   //Select by visible text in dropdown
   WebElement dropdownField = driver.findElement(By.id("drop1"));
   Select select = new Select(dropdownField);
   select.selectByIndex(1);

   //Select by multiselect box text in dropdown
   WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
   Select select2 = new Select(multiSelectionBoxField);
   select2.selectByIndex(0);

   driver.quit();
   System.out.println("Browser Quit");
	}
}