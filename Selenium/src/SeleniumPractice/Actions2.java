package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement click =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		a.doubleClick(click).perform();
		Alert b = driver.switchTo().alert();
		
		b.accept();
		
		

	}

}
