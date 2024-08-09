package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class TestChrome {
//    WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil IT\\eclipse-workspace\\TestSeleniumWebDriver\\resources\\chromedriver.exe");

//	    ChromeOptions options=new ChromeOptions();
//	    options.addArguments("--remote-allow-origins=*");
//	    driver = new ChromeDriver(options);
//	    driver.manage().window().maximize();
		
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.seleniumhq.org/download/");
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    System.out.println("Title: "+"selenium");
//	    System.out.println("Title: "+"fnsta");
	    driver.quit();
	    System.out.println("Browser Quit");

	}

}


//File app=new File("path");
//DesiredCapabilities capabalities=new DesiredCapabilities();
//capabalities.setCapabality("automationName","Selandriod");
//
//capabalities.setCapabality(MobileCapabalityType.PLATFORM_NAME, "Andriod");
//capabalities.setCapabality(MobileCapabalityType.PLATFORM_VERSION, "Andriod");
//capabalities.setCapabality(MobileCapabalityType.DEVICE_NAME, "Andriod");
//capabalities.setCapabality(MobileCapabalityType.App, "Andriod");
//
//driver = new AndriodDriver(new URL("http://127.0.0.0:4723/wd/hub"));
//
//driver.manage().timesout().implicitlyWait(60L, TimeUnit.SECONDS);
//
//waitForElementPresent(By.id(button1), 40);
//  driver.findElement(By.id(button1)).click();
//  
//Thread.sleep(3000);
//Set<String> contextNames = driver.getContextHandles();
//for(String contextname : contextNames)
//{
//	
//}

