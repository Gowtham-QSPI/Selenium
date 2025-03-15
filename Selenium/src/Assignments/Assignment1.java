package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=717602284790&hvpos=&hvnetw=g&hvrand=11199537913498915460&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061899&hvtargid=kwd-10573980&hydadcr=14453_2405312&gad_source=1");
		driver.findElement(By.className("nav-input")).sendKeys("Elcetronics",Keys.ENTER);

	}

}
