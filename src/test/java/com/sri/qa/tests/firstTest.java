package com.sri.qa.tests;

import com.sri.qa.listeners.TestNGListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sri.qa.base.BaseTest;
@Listeners(TestNGListeners.class)
public class firstTest {
	public WebDriver driver;

	@BeforeTest
	public void init()
	{
		BaseTest driverIn=new BaseTest();
		driver=driverIn.driverInit();
	}
	@Test
	public  void test()
	{
		System.out.println("test1");

		driver.findElement(By.id("email")).sendKeys("sridevi");


	}
	@Test
	public void testfailed()
	{
		driver.findElement(By.id("email")).sendKeys("sridevi");
   Assert.assertTrue(false);

	}
}
