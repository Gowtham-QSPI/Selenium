package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("Good");
	}

}
