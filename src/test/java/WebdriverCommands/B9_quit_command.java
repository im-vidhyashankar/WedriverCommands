package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B9_quit_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Open a popup window")).click();
    driver.quit();
	}
}
