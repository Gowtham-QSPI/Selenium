package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.findElement(By.name("username")).sendKeys("Gowthaman",Keys.TAB);
driver.findElement(By.name("password")).sendKeys("12345");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
