package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		//Instantiate chrome browser driver
		//System.setProperty("wedriver.chrome.driver","//Users//m_238194//Desktop//workspace//chromedriver");
		System.setProperty("wedriver.chrome.driver","//Users//m_238194//Desktop//workspace//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("testing testing");
		System.out.println("Additional line");
	}
}
