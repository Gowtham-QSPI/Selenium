package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Get_Locations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point axis = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).getLocation();
		int X_axis=axis.getX();
		int Y_axis=axis.getY();
		
		Point axis2 =driver.findElement(By.cssSelector("input[placeholder*='Pass']")).getLocation();
		int X_axis2 = axis2.getX();
		int Y_axis2 = axis2.getY();
		if (X_axis==X_axis2) {
			System.out.print("Matched Horizontally");
			
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

}
