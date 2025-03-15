package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		boolean a = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		System.out.println(a);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", driver.findElement(By.xpath("//input[@class='form-control']")));
		boolean b = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		System.out.println(b);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Computer");
		
		

	}

}
