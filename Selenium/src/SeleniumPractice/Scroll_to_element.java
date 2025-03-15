package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement a = driver.findElement(By.xpath("//h2[text()='Featured Product']"));
		//js.executeScript("arguments[0].scrollIntoView(true);",a);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		

	}

}
