package com.mobileapp.parallelExecution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends AppiumTestNG_Sample
{
	@Test
	public void loginTestVerfication()
	{
		driver.findElement(By.xpath("Dashboard")).click();
		String actualAccountUsername = driver.findElement(By.xpath("Account")).getText();
		String expectedAccoutUsername = "1234";
		Assert.assertEquals(actualAccountUsername, expectedAccoutUsername);
	}

}
