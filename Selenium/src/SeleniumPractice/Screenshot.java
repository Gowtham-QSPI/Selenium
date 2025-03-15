package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dream11.com/");
		TakesScreenshot convert = (TakesScreenshot) driver;
		File Source =convert.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\bgowthag\\screenshots.png");
		Files.copy(Source, Dest);
		

	}

}
