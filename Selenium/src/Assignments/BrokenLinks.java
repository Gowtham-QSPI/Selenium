package Assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.xpath("//li[@class='gf-li']"));
		SoftAssert s= new SoftAssert();
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URI(url).toURL().openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			s.assertTrue(respcode<400, "the "+url+"is broken");
					
			
		}
		s.assertAll();

	}

}
