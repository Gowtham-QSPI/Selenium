package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@role='button']"))));
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"))));
		//driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8825582593",Keys.ENTER);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='_1wGnMD _1W0l9N _1DfMXZ']")).click();
		Actions a = new Actions(driver);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Electronics']"))));
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Electronics GST Store']"))).click().perform();
		List<WebElement> list1 =driver.findElements(By.xpath("//div[@class='ZHvV68']"));
		List<WebElement> b = list1.stream().filter(s->s.getText().contains("Mobile Holders")).collect(Collectors.toList());
		b.get(0).click();
		Thread.sleep(3000);
		List<WebElement> c = driver.findElements(By.xpath("//a[@class='wjcEIp']"));
		c.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		List<WebElement> d =driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		d.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		int j=0;
		for(int i=0;i<c.size()-1;i++) {
			if(c.get(i).getText().contains("Portronics")) {
				//c.get(i).getText().contains("Portronics")
				String price =d.get(i).getText();
				System.out.println();
				System.out.println(c.get(i).getText());
				System.out.print(price);
				
				
			}j++;
			if(j==c.size()-1) {
				break;
			}
		}
		
				

	}

}
