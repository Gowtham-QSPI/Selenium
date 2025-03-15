package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('custom_gender').value='male';");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('custom_gender').value='Male';");
		
	}
	
}
