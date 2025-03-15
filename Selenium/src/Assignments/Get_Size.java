package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension Login=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).getSize();
		int LoginHeight = Login.getHeight();
		int Loginwidth =Login.getWidth();
		Dimension password = driver.findElement(By.cssSelector("input[placeholder*='Pass']")).getSize();
		int passwordHeight = password.getHeight();
		int passwordWidth =password.getWidth();


		if(LoginHeight==passwordHeight && Loginwidth== passwordWidth) {
			System.out.println("All size are Equal");
		}
		else{
			System.out.println("Failed");

		}

	}

}
