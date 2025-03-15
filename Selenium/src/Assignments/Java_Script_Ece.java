package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Ece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000);");
		//js.executeScript("arguments[0].scrollIntoView(false);",driver.findElement(By.xpath("//a[text()='My account']")));
		//js.executeScript("arguments[0].scrollIntoView(false);",driver.findElement(By.xpath("//a[text()='My account']")));
		//WebElement element = driver.findElement(By.xpath("//a[text()='Facebook']"));
		//js.executeScript("arguments[0].scrollIntoView(true);",element);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollTop);");
		

	}

}
