package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement a = driver.findElement(By.xpath("//div[@class='box-body']/form/div/input"));
		System.out.println(a.isEnabled());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('disabled');",a);
		System.out.println(a.isEnabled());
		
		
		
		

	}

}
