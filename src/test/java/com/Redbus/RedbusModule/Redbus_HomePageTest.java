package com.Redbus.RedbusModule;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Redbus.GenericUtility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus_HomePageTest {
	
	@Test
	public void fromPlace() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/bus-tickets/mysore-to-bangalore?fromCityName=Mysore,%20Karnataka,%20India&fromCityId=129&toCityName=Bangalore,%20Karnataka,%20India&toCityId=122&onward=24-Nov-2022&srcCountry=IND&destCountry=IND&sfcn=Mysore&stcn=Bangalore&opId=0&busType=Any");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[text()='Got It']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		List<WebElement> busnames = driver.findElements(By.xpath("//ul[@class='bus-items']/child::div/descendant::div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement> times=driver.findElements(By.xpath("//ul[@class='bus-items']/child::div/descendant::div[@class='dp-time f-19 d-color f-bold']"));
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
		for (int i = 0; i < busnames.size(); i++) {
			String allbus = busnames.get(i).getText();
			String alltime = times.get(i).getText();
			//System.out.println(allbus);
			hm.put(allbus, alltime);
		}
		for (Entry<String, String> web : hm.entrySet()) {
			System.out.println(web.getKey()+"===>"+web.getValue());
		}
	}

}
