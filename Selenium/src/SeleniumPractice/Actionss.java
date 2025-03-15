package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement notebook = driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"));
		//a.moveToElement(computer).pause(Duration.ofSeconds(10)).moveToElement(notebook).click().perform();
		//Now to direcctly click
		a.moveToElement(computer).pause(Duration.ofSeconds(5)).click(notebook).perform();
		//to double click
		//a.doubleClick(webelement);
		

	}

}
