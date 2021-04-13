package com.mobileapp.parallelExecution;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTestNG_Sample 
{
		public AndroidDriver<MobileElement> driver;

		@Parameters({ "deviceName","UDID","platformVersion", "URL" })
		@BeforeMethod
		public void beforeMethod(String deviceName,String UDID,String platformVersion,String URL) throws MalformedURLException, InterruptedException {
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("udid", UDID);
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\apps\\NoBroker Flat Apartment House Rent Buy Sell_v6.8.277_apkpure.com.apk");
			capabilities.setCapability("appPackage", "com.nobroker.app");
			capabilities.setCapability("appActivity", "com.nobroker.app.activities.NBSplashScreen");
			driver = new AndroidDriver<MobileElement>(new URL("https://"+URL), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
		}

		@AfterMethod
		public void afterMethod() 
		{
			driver.quit();
		}
}

