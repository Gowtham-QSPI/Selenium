package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcss_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
String colour=		driver.findElement(By.className("ico-register")).getCssValue("color");
System.out.println(colour);

String[] colour2=colour.split("(");
String[] colour3 =colour2[1].split(",");
String colour4 = colour3[3].trim();



driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://rgbacolorpicker.com/rgba-to-hex");
driver.findElement(By.id("color-r")).clear();
driver.findElement(By.id("color-r")).sendKeys("175");

driver.findElement(By.id("color-g")).clear();
driver.findElement(By.id("color-g")).sendKeys("3");

driver.findElement(By.id("color-b")).clear();
driver.findElement(By.id("color-b")).sendKeys("4");

driver.findElement(By.id("color-a")).clear();
driver.findElement(By.id("color-a")).sendKeys("1");

String printHexavlaue =  driver.findElement(By.cssSelector("div[class='cursor-pointer select-all text-xl tracking-wider']")).getText();
System.out.println(printHexavlaue);




	}

}
