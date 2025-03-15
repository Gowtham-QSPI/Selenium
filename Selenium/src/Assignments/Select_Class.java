package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	/*	driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement a =	driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
Select b = new Select(a);

b.selectByIndex(3);
System.out.println(b.getFirstSelectedOption().getText());


	}*/
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		
		

}}
		
