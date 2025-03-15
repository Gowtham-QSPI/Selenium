package Assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Is_Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
boolean enabled= driver.findElement(By.cssSelector("div input[class='form-control']")).isEnabled();
if(enabled) {
	System.out.println("it is enabled");
	
	
}
else {
	System.out.print("Not enabled");
}
		
		

	}

}
