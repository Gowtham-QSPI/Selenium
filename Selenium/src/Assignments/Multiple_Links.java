package Assignments;

import java.util.List;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mini = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul[1]"));
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> links = mini.findElements(By.tagName("a"));
		for(int i=1;i<links.size();i++) {
			links.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		
		

	}

}
