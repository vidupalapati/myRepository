package com.TestScripts.HybridFramework;

import org.testng.annotations.*;

import com.GenericLib.HybridFramework.Base;
import com.GenericLib.HybridFramework.EventList;

@Listeners(EventList.class)
public class deleteFromCartTest extends Base 
{
	@Test
	public void deleteFromCart()
	{
		hp.getCart().click();
		hp.getDeleteFromCart().click();
	}
}
