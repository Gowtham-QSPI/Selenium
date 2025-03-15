package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element1= driver.findElement(By.linkText("Facebook"));
		WebElement element2= driver.findElement(By.linkText("Twitter"));

		
		js.executeScript("arguments[1].scrollIntoView(false)",element1,element2  );

	}

}
