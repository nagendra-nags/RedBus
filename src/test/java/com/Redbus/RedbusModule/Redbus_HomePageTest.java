package com.Redbus.RedbusModule;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Redbus.GenericUtility.BaseClass;
import com.Redbus.PomRepo.BookBusTravel;
public class Redbus_HomePageTest extends BaseClass{
	@Test
	public void book() throws InterruptedException
	{
	
		BookBusTravel bbt=new BookBusTravel(driver);
		bbt.getAcceptbtn().click();
		bbt.getFromclick().sendKeys("mysor");
		bbt.getSelectdd().click();
		bbt.getDestclick().sendKeys("Hassa");
		bbt.getDestdd().click();
		bbt.getDate().click();
		Thread.sleep(5000);
		bbt.getSelectdate().click();
		bbt.getSearchbtn().click();
		
	}
}
