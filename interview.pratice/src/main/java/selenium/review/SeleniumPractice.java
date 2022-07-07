package selenium.review;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
	public static void main(String[] args) {
		
		WebElement signInBtn= driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", signInBtn);
		//signin button must enable to click before click ==> explicit wait/WebDriver wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));// wait for object properties like
		wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
		signInBtn.click();
		
		
		WebElement email= driver.findElement(By.xpath("//*[@id='email']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", email);
		//signin button must enable to click before click ==> explicit wait/WebDriver wait
		wait.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys("sarowerny@gmail.com");
		
		WebElement password= driver.findElement(By.xpath("//*[@id='passwd']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", password);

		WebElement signout == driver.findElement(By.xpath("//*[@id='email'])"
}
