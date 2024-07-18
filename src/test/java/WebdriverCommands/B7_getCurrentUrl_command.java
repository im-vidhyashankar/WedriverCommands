package WebdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B7_getCurrentUrl_command {
	
	public static void main (String args[]) {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://omayo.blogspot.com/");
    driver.manage().window().maximize();
     String url=driver.getCurrentUrl();
     System.out.println(" The current url of page is :" + url);
	}
}
