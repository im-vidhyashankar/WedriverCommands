package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A3_fullscreen_command {
	
    public static void main(String[] args) {
      
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().fullscreen();
       
 }

}
