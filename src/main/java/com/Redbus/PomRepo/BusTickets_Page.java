package com.Redbus.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTickets_Page {

	@FindBy(xpath="//div[@class='onward-modify-btn g-button clearfix fl']")
	private WebElement modifyBtn;
	
	@FindBy(xpath="//input[@id='src']")
	private WebElement fromTF;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement toTF;
	
	@FindBy(xpath="//input[@class='DatePicker__InputElm-sc-1lzvcq8-3 eBmHsT showNow Date']")
	private WebElement dateTF;
	
	@FindBy(xpath="//button[@class=' button ms-btn']")
	private WebElement searchBtn;

	public WebElement getModifyBtn() {
		return modifyBtn;
	}

	public WebElement getFromTF() {
		return fromTF;
	}

	public WebElement getToTF() {
		return toTF;
	}

	public WebElement getDateTF() {
		return dateTF;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public BusTickets_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
