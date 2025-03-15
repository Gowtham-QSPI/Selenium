package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c'][1]/div[1]")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'][1]/div[2]/div/following-sibling::div[2]")).click();
			i++;
			
			}
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'][2]/div[@class='css-1dbjc4n r-1awozwy r-18u37iz']/div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']")).click();
		
		System.out.println(i);
		

	}

}
