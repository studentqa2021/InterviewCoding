package interview.pratice1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTablePractice {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	driver.get("https://money.cnn.com/data/us_markets/");	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 03));

    List<WebElement>allRows =driver.findElements(By.xpath("//*[@id='wsod_marketMoversContainer']/table/tbody/tr"));
    System.out.println("Row count ="+allRows.size());
    System.out.println("1st row data ="+allRows.get(0).getText());
    System.out.println("Last row data="+allRows.get(allRows.size()-1).getText());
    System.out.println("Before Last row data="+allRows.get(allRows.size()-2).getText());
    
    List<WebElement>allPrice =driver.findElements(By.xpath("//*[@id='wsod_marketMoversContainer']/table/tbody/tr/td[2]"));
    List<Double> myPriceList = new ArrayList<>();
    for (int i= 0;i<allPrice.size();i++) {
    	myPriceList.add(Double.parseDouble(allPrice.get(i).getText()));
    	
    }
    
    System.out.println("All value"+myPriceList);
    
    double maxValue =Collections.max(myPriceList);
    System.out.println("Max Value = "+maxValue);
    
    
    double minValue =Collections.min(myPriceList);
    System.out.println("Min Value = "+minValue);
    
    driver.quit();
    }

}

