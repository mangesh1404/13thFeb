package comtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to open a chrome browser
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kiran@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button"));
		login.click();
	}
	
}
