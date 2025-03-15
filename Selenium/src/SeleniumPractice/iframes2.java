package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("984296447");
		driver.switchTo().defaultContent();

	}

}
