package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handles {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(8));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='blinkingText']"))).click().build().perform();
		Set<String> tabs = driver.getWindowHandles();
		for(String tab : tabs) {
			System.out.println(tab);
		}
		Iterator<String> each = tabs.iterator();
		String parent = each.next();//driver switched to parent
		String child =each.next();//driver swithched to child
		driver.switchTo().window(child);
		String Email = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(Email);
		driver.findElement(By.xpath("//a[@class='blinkingText']")).getText();
		
		
		

	}

}
