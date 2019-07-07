package com.pages;

import java.io.FileInputStream;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	 static int x = 10;
	static WebDriver driver ;
	//FileInputStream fis = new FileInputStream("");
	
	@Test
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","/home/pritesh/Documents/chromedriver_linux64/chromedriver");;
		driver = new ChromeDriver();
		driver.navigate().to("https://jar-download.com/download-handling.php");
		System.out.println(x);
		
		
		
	}
}
