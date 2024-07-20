package WebdriverCommands;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C6_getPageSource_command {
	
	public static void main (String args[]) throws IOException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "http://compendiumdev.co.uk/selenium/basic_web_page.html");
    String sourceCode = driver.getPageSource();
    System.out.println("The page source code is :" +sourceCode);
     
    driver.quit();
    
    
    
	}
}
