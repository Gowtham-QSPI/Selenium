package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.id("confirm")).click();
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
