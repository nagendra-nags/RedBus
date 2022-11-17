package com.Redbus.RedbusModule;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Redbus.GenericUtility.BaseClass;
import com.Redbus.PomRepo.HomePage;

public class BookTicketTest extends BaseClass {
@Test
public void book() throws InterruptedException {
	HomePage hp=new HomePage(driver);
	hp.addredbus();
}
}
