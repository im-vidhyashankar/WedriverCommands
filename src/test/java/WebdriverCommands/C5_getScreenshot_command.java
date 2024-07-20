package WebdriverCommands;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C5_getScreenshot_command {
	
	public static void main (String args[]) throws IOException {

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get( "https://tutorialsninja.com/demo/");
    driver.manage().window().maximize();
 
    //    Write code here
    //    File scrcScreenshot = driver.findElement(By.className("col-sm-5")).getScreenshotAs(OutputType.FILE);
    //    FileHandler.copy(scrcScreenshot, new File(System.getProperty("user.dir")+"\\screenshot.png"));

    // Take screenshot
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   // Save the screenshot to a file
    File destinationFile = new File("screenshot.png");
    FileHandler.copy(screenshot, destinationFile);
    System.out.println("Screenshot saved to " + destinationFile.getAbsolutePath());

    driver.quit();
    
    
    
	}
}
