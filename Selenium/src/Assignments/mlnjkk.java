package Assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mlnjkk {
	public static Scanner a = new Scanner(System.in);


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String c= from();
		String d =to();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).click();
		Thread.sleep(2000);
		
List<WebElement> options=		driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
for(WebElement option : options) {
	if(option.getText().equalsIgnoreCase(c)) {
		option.click();
		break;
	}
	
}
Thread.sleep(2000);

List<WebElement> drops = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
for(WebElement drop:drops) {
	if(drop.getText().equalsIgnoreCase(d)) {
		drop.click();
		break;
	}
	
}

	}
	
	public static String from() {
		
		System.out.println("Enter the From Location");
		System.out.println();

String start = a.nextLine();
return start;
		
	}
	
	public static String to() {
		
		
		System.out.println("Enter the To Location");
		System.out.println();
String end = a.nextLine();
return end;

		
	}

}
