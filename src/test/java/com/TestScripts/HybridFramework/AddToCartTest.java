package com.TestScripts.HybridFramework;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.*;
import com.GenericLib.HybridFramework.Base;
import com.GenericLib.HybridFramework.EventList;

@Listeners(EventList.class)
public class AddToCartTest extends Base 
{
	@Test
	public void addToCartTest()
	{
		hp.getNexus_6().click();
		hp.getAddToCart().click();	
		cu.waitForAlert();
		cu.acceptAlert(driver);
		hp.getCart().click();
		try
		{
			hp.getNexusCart();
		}
		catch(NoSuchElementException e)
		{
			Assert.assertTrue(false,"Test Case Failed !");;
		}
	}
}
