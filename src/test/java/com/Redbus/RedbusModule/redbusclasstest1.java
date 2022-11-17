package com.Redbus.RedbusModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbusclasstest1 {

	@Test
	public void redbustest() throws IOException, InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String expectedtext = "Swargate, Pune, Maharashtra, India";
		
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\PropertyFlie\\commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String URL = p.getProperty("url");
		driver.get(URL);
	   driver.findElement(By.xpath("//button[text()='Accept All']")).click();
driver.findElement(By.xpath("//input[@id='src']")).click();
	 //  Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
Thread.sleep(2000);
WebElement actualtext = driver.findElement(By.xpath("//li[@class='liBpList' and contains(.,'Swargate, Pune, Maharashtra, India')]"));		
String text = actualtext.getText();
System.out.println(text);     
	
	if(expectedtext.contains(text))
	{
		actualtext.click();
	}
	
	
}
}