package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Context_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Actions a = new Actions(driver);
WebElement b= driver.findElement(By.xpath("//span[text()='right click me']"));
driver.findElement(By.xpath("//span[text()='Edit']"));
a.moveToElement(b).contextClick().moveToElement(driver.findElement(By.xpath("//span[text()='Edit']"))).click().perform();
Alert c = driver.switchTo().alert();
c.accept();


	}

}
