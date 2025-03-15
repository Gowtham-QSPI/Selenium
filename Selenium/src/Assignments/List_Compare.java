package Assignments;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class List_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		List<WebElement> a =driver.findElements(By.xpath("//tr/td[1]"));
		List<String> original= a.stream().map(s->s.getText()).collect(Collectors.toList());
		
	List<String> sorted=	 original.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(sorted.equals(original));
		
		

	}

}
