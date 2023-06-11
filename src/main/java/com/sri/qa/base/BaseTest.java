package com.sri.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;


	public WebDriver  driverInit()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		return driver;


	}

}
