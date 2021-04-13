package com.mobileapp.parallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends AppiumTestNG_Sample
{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("Navigation button")).click();
		driver.findElement(By.xpath("Username")).clear();
		driver.findElement(By.xpath("Username")).sendKeys("1234");
		driver.findElement(By.xpath("password")).clear();
		driver.findElement(By.xpath("password")).sendKeys("1234");
		driver.findElement(By.xpath("continue")).click();
		
	}

}
