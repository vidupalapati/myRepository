package com.GenericLib.HybridFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class EventList implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot scrShot =((TakesScreenshot)Base.driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("./Screenshots/"+System.currentTimeMillis()+".png");
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
