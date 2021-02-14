package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboardtest {

	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
	}
	
	
	@Test
	public void test03() {
		lp.ValidLogin();
		dp.getCourses();
		
	}
	
}
