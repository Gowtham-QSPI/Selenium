package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	
		
	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.get("https://www.meesho.com/");
				driver.get("https://demowebshop.tricentis.com/");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,2000);");
				Thread.sleep(3000);
				js.executeScript("window.scrollTo(0,0);");
				//driver.findElement(By.linkText("Facebook")).click();
				
				

				
			

			}

		


	}


