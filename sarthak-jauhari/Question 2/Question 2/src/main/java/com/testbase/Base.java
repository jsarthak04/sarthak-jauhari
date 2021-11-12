package com.testbase;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {
	public static AndroidDriver<AndroidElement> driver;
	DesiredCapabilities caps = new DesiredCapabilities();

	@BeforeSuite
	public void app() throws MalformedURLException, InterruptedException {				

		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "52001853becb9407");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.monefy.app.lite");
		caps.setCapability("appActivity", "com.monefy.activities.main.MainActivity_");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
	}

	

	@AfterSuite
	public void aftersuite() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
