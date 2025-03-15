package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("QSPIPRACTISE@gmail.com",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Gowtham");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add your')]")).click();
		driver.findElement(By.xpath("//input[@name='AddProductReview.Title']")).sendKeys("Not Nice");
		driver.findElement(By.id("AddProductReview_ReviewText")).sendKeys("Not a Good Prduct");
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		WebElement review = driver.findElement(By.xpath("//input[@value='Submit review']"));
		if(review.isEnabled()) {
			review.click();
		}
		
		
	}

}
