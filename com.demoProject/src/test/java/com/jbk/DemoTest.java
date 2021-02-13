package com.jbk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		 driver = new ChromeDriver();// to open a chrome browser
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kiran@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button"));
		login.click();
		
	}
	@Test
	public void test02() {
		WebDriver d =driver.switchTo().newWindow(WindowType.TAB);
		d.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}
	
	@Test
	public void test03() {
		WebElement state = driver.findElement(By.xpath("//select"));
		Select sel = new Select(state);
		sel.selectByValue("");
		
	}
	
}
