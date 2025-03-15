package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBook {
	public static Scanner get = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String start = from();
		String end = To();
		WebDriver driver  = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz'] //div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).click();
		
		
		
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for(WebElement city : cities) {
			if(city.getText().equalsIgnoreCase(start)) {
				city.click();
				break;
			}
		}
		List<WebElement> reaches = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for(WebElement reach : reaches) {
			if(reach.getText().equalsIgnoreCase(end)) {
				reach.click();
				break;
			}
		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")));
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[1]")).click();
		int i=1;
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'])[1]/div[3]")));
		while (i<5) {
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'])[1]/div[3]")).click();
		i++;
		
		}
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'])[2]/div/following-sibling::div[2]")).click();
		

	}
	
	public static String from() {
		
		System.out.println("enter the from location ");
		return get.nextLine();
		
		
		
	}
	public static String To() {
		System.out.println("Enter the To location");
		return get.nextLine();
	}

}
