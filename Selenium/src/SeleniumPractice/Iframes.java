package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bgowthag/Downloads/iframe%20(1).html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.switchTo().defaultContent();
		
		//driver.switchTo().Parentframe(); This is to switch from child frame to parent frame one step

				

	}

}
