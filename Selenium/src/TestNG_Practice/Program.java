package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program {

	@Test(groups= "sanity")
	public void testCase1() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

	}
	
	@Test
	public void testCase2() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

	}
	
	@Test(groups="sanity")
	public void testcase3() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-accessories/mobile-holders/pr?sid=tyy%2C4mr%2Cvnf&marketplace=FLIPKART&hpid=2N73GsIlR7xzYYIFYo0obKp7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJQcm90ZWN0IHlvdXIgQWNjIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiTU9IR040NlpSR0FHQkNLRiIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIk1vYmlsZSBIb2xkZXJzIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&fm=neo%2Fmerchandising&iid=M_9644bf2a-7b3a-4af7-b83e-b63315d2b37b_12.U2BCKFKPUE1I&ppt=hp&ppn=homepage&ssid=79nqul54xs0000001732731597369&otracker=clp_omu_Mobile%2BAccessories_1_12.dealCard.OMU_elec-b2b-store_elec-b2b-store_U2BCKFKPUE1I_3&otracker1=clp_omu_PINNED_neo%2Fmerchandising_Mobile%2BAccessories_NA_dealCard_cc_1_NA_view-all_3&cid=U2BCKFKPUE1I");;
		
	}
	
	

}

