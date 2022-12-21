package com.GenericLib.HybridFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.ObjectRepo.HybridFramework.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
	public FileLib fl = new FileLib();
	public CommonUtil cu = new CommonUtil();
	String PropPath = "TestData\\config.properties";
	public HomePage hp;
		
	@BeforeTest
	public void configBT() throws IOException
	{
		if(fl.getProperties(PropPath,"Browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(fl.getProperties(PropPath,"Browser").equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		if(fl.getProperties(PropPath,"Browser").equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		hp = PageFactory.initElements(driver,HomePage.class);
		driver.get(fl.getProperties(PropPath,"URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void configBM() throws InterruptedException, IOException
	{
		hp.getLogin().click();
		hp.getUsername().sendKeys(fl.getProperties(PropPath, "username"));
		hp.getPassword().sendKeys(fl.getProperties(PropPath, "password"));
		hp.getLoginButton().click();
		Thread.sleep(4000);
		Assert.assertTrue(hp.getNameOfUser().getText().contains(fl.getProperties(PropPath, "username")));
	}
	
	@AfterMethod
	public void configAM()
	{
		hp.getLogout().click();
	}
	@AfterTest
	public void configAT()
	{
		driver.quit();
	}
}
