package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A1_get_command {

	        public static void main(String[] args) {
	              
	              WebDriverManager.chromedriver().setup();
	              WebDriver driver = new ChromeDriver();
	              driver.get("http://tutorialsninja.com/demo/");                      
	       }

	}