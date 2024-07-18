package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C4_isSelected_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
 
    //Write code here
   
   boolean checkboxSelected = driver.findElement(By.id("checkbox1")).isSelected();
   System.out.println("Checking checkecbox is selected or not : "+checkboxSelected);

   boolean checkboxnotSelected = driver.findElement(By.id("checkbox2")).isSelected();
   System.out.println("Checking checkecbox is selected or not : "+checkboxnotSelected);

   driver.quit();
    
	}
}
