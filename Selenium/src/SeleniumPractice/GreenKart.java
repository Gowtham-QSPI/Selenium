package SeleniumPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//check forSroted list
		driver.findElement(By.xpath("//thead/tr/th[@role='columnheader'][1]")).click();

		List<WebElement> origlist = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> notsorted =origlist.stream().map(s->s.getText()).collect(Collectors.toList());
		notsorted.stream().forEach(s->System.out.println(s));

		List<String> sorted = origlist.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		sorted.stream().forEach(s->System.out.println(s));
		
		
		Assert.assertTrue(sorted.equals(notsorted));
		//Assert.assertEquals(sorted.equals(notsorted), true);
		
		
		
	}

}
