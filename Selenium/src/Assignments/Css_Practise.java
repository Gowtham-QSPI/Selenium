package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Goofle",Keys.ENTER);
				
		
	}

}
