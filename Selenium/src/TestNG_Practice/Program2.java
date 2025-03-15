package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program2 {

	@Test(groups= "smoke")
	public void testCase1() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertTrue(false);

	}
	
	@Test
	public void testCase2() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

	}
	
	
}

