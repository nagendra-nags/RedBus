package com.Redbus.PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusTickets_Page {

	//@FindBy(xpath="//div[@class='onward-modify-btn g-button clearfix fl']")
	//private WebElement modifyBtn;
	
	@FindBy(xpath="//div[@class='source input-box ']")
	private WebElement source;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement destination;
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement date;
	
	@FindBy(xpath="//input[@id='r-date']")
	private WebElement returndate;
	
	@FindBy(xpath="//button[@id='search_butn']")
	private WebElement submit;

	@FindBy(xpath="//button[text()='Accept All']")
	private WebElement cookiesaccept;









}
