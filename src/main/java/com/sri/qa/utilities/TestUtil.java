package com.sri.qa.utilities;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TestUtil {


	public static void takeScreenshot(String failedMethod,WebDriver driver)
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		try {
			FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir"+"//screenshots//"+failedMethod+".jpg")));
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
