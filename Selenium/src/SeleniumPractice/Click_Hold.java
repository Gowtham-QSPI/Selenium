package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		//driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		WebElement mobcharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement Lapcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobdrop = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		WebElement Lapdrop = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		a.clickAndHold(mobcharger).release(mobdrop).perform();
		a.clickAndHold(Lapcharger).release(Lapdrop).perform();
		
		

		
	

	}

}
