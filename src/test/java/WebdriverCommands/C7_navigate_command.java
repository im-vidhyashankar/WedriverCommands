package WebdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C7_navigate_command {
	
	public static void main (String args[]) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
  	//we can achieve same thing .get url,
   //Diff is : Navigate has more advantages like : back, forward, refresh	

    driver.get("https://www.woolworths.com.au/");
    System.out.println("Opened URL : Woolworths");
    Thread. sleep(2000);
    
     //Write code here
     driver.navigate().to("https://www.sherpa.net.au/");
     System.out.println("Navigated to URL : Sherpa Delivery");
     Thread.sleep(2000);
     
     driver.navigate().refresh();
     System.out.println("Page is getting refreshed");
     Thread.sleep(2000);
    
     driver.navigate().back();
     System.out.println("User is navigated back to Woolworths page");
     Thread.sleep(2000);
    
     driver.navigate().forward();
     System.out.println(" Forwaded to URL : Sherpa Delivery");
     Thread.sleep(2000);

     driver.quit();
    
	}
}
