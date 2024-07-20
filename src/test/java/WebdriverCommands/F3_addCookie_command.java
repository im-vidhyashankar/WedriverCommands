package WebdriverCommands;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class F3_addCookie_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://tutorialsninja.com/demo/");
    
    Cookie cookie = driver.manage().getCookieNamed("OCSESSID");
            
           System.out.println("Cookie Name: " +cookie.getName());
           System.out.println("Cookie Value: " +cookie.getValue());
           System.out.println("Cookie Domain: " +cookie.getDomain());
           System.out.println("Cookie Path: " +cookie.getPath());
           System.out.println("Cookie Expiry Date: " +cookie.getExpiry());
           System.out.println("------------------" );
          
    driver.quit();
    System.out.println("Browser Quit");
	}
}