package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Calender_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		String  month ="6";
		String date="12";
		String year ="2027";
		String[] completedate = {month,date,year};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		List<WebElement> months = driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month"));
		for(int i=0; i<months.size();i++) {
			if(i+1==Integer.parseInt(month)) {
				months.get(i).click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> c = driver.findElements(By.xpath("//input[contains(@class,'react-date-picker__inputGroup__input react-date-picker__')]"));
		for(int j=0;j<c.size();j++) {
	String d =c.get(j).getAttribute("value");
	Assert.assertEquals(completedate[j], d);
		}
		
		



	}

}
