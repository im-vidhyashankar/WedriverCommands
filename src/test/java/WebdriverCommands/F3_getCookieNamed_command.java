package WebdriverCommands;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class F3_getCookieNamed_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //new keyword of java is creating an object for the chrome driver class for the selenium, driver is object reference of chromedriver class
    driver.manage().window().maximize();

    driver.get("http://tutorialsninja.com/demo/");
    
    Cookie cookie = new Cookie("Vidhya","Shankar");
    driver.manage().addCookie(cookie);
    driver.quit();
    System.out.println("Browser Quit");
	}
}