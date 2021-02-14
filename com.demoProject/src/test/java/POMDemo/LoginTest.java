package POMDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	Logger log = Logger.getLogger(LoginTest.class);
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	@BeforeMethod
	public void setUp() {
		log.info("--------------------------------------");
		log.info("intializing browser");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("chrome browser opened");
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		log.info("JBK offline application launched");
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		log.info("all webElements initialized");
	}
	@AfterMethod
	public void tearDown() {
		log.info("closing the browser");
		driver.close();
	}
	@Test// tester working login page
	public void validLoginTest() {
		log.info("logging in to the JBK application");
		log.warn("do not enter numric username");
		lp.enterUname("mangesh@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
		log.info("user logged in to the JBK application");
	}
	
	@Test// tester working on Dashboard page
	public void test02() {
		log.info("user logging in with invalid credentials");
		lp.ValidLogin();
		log.info("user will bot logged in to the application");
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}

	
}
