package WebdriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_maximize_command {

	public static void main(String[] args) {

		   WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           
           driver.manage().window().maximize();
           
           
    }

}
	


//driver: This is the WebDriver instance controlling the browser. It represents the browser window or tab where the automated interactions will take place.
//manage(): This method returns an Options interface that allows access to the browser's options and settings.
//window(): This method returns a Window interface that provides methods to interact with the browser window.
//maximize(): This method is called on the Window interface to maximize the browser window to its maximum size.