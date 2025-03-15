package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bgowthag/Desktop/Ownlogin.html");
		driver.findElement(By.id("Fine")).sendKeys("Im fine");
		
	}
}
