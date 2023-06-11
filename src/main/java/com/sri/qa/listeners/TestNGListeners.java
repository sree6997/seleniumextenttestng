package com.sri.qa.listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sri.qa.base.BaseTest;
import com.sri.qa.reports.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sri.qa.utilities.TestUtil;

public class TestNGListeners extends BaseTest implements ITestListener{

 ExtentReports extentReports= ExtentReport.getExtentReportObject();
 ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest=
		extentReports.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
  extentTest.log(Status.PASS,"passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.log(Status.FAIL,"failed");
		extentTest.fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.log(Status.SKIP,"skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
  extentReports.flush();
	}


}
