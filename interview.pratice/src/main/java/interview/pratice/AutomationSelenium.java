package interview.pratice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationSelenium {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	    
	 //  WebDriver signingBtn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")))
	   // WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	   // wait.until(ExpectedConditions.elementToBeClickable(password));
	    
	    
	}

}
