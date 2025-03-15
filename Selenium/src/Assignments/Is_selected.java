package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Is_selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");

		boolean b = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(b);
		Assert.assertFalse(b);
		driver.findElement(By.id("RememberMe")).click();
		boolean c = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(c);
		Assert.assertTrue(c);
		
		

	}

}
