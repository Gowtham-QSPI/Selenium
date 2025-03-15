package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3 {

	@Test
	public void testCaset() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}
}
