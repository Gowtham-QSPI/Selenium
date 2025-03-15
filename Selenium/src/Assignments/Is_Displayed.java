package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");

		boolean a = driver.findElement(By.cssSelector("input[value='Search']")).isDisplayed();
		System.out.println(a);
		boolean b = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(b);
		boolean c= driver.findElement(By.cssSelector("input[value='Search']")).isEnabled();
		System.out.print(c);
		
	}

}
