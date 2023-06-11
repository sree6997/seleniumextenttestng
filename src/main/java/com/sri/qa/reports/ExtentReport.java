package com.sri.qa.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {
  static ExtentReports extentReports;

  public static ExtentReports getExtentReportObject()
  {
    String report=
    System.getProperty("user.dir")+"//reports/extent.html";
    ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(report);
    extentSparkReporter.config().setDocumentTitle("extent parctice");
    extentSparkReporter.config().setReportName("extent pratice report");
    extentReports=new ExtentReports();
    extentReports.attachReporter(extentSparkReporter);
    extentReports.setSystemInfo("tester","sri");
    return extentReports;
  }
}
