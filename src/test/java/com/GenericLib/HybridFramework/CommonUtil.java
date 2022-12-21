package com.GenericLib.HybridFramework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil 
{
	WebDriverWait wait;
	
	public void acceptAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void waitForAlert()
	{
		wait=new WebDriverWait(Base.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}
}
