package com.Redbus.RedbusModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Redbus.GenericUtility.BaseClass;
import com.Redbus.PomRepo.BookBusTravel;
import com.Redbus.PomRepo.SearchBusTicket;
public class Redbus_HomePageTestCase extends BaseClass{
	@Test
	public void book() throws InterruptedException
	{
	String Exp="Oops! No buses found.";
		BookBusTravel bbt=new BookBusTravel(driver);
		SearchBusTicket sbt=new SearchBusTicket(driver);
		bbt.getAcceptbtn().click();
		bbt.getFromclick().sendKeys("mysor");
		bbt.getSelectdd().click();
		bbt.getDestclick().sendKeys("Hassa");
		bbt.getDestdd().click();
		bbt.getDate().click();
		Thread.sleep(5000);
		bbt.getSelectdate().click();
		bbt.getSearchbtn().click();//div[@class='oops-wrapper']
		
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),\"Oops! No buses found.\")]"));
		String text1 = text.getText();
		System.out.println(text1);
	
		if(Exp.equalsIgnoreCase(text1))
		{
			sbt.getModifybtn().click();
			sbt.getDstclick().clear();
		    sbt.getDstclick().sendKeys("benga");
			sbt.getDstselect().click();
			sbt.getSearchbtn().click();
		}
		
		
	}
}
