package com.Redbus.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBusTicket {
	WebDriver driver;
	public  SearchBusTicket(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='onward-modify-btn g-button clearfix fl']")
	private WebElement modifybtn;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement dstclick;
	
	@FindBy(xpath="//div[@class='aligned-item' and contains(text(),\"Bengaluru\")]")
	private WebElement dstselect;
	
	@FindBy(xpath="//button[contains(text(),\"SEARCH\")]")
	private WebElement searchbtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getModifybtn() {
		return modifybtn;
	}

	public WebElement getDstclick() {
		return dstclick;
	}

	public WebElement getDstselect() {
		return dstselect;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	

}
