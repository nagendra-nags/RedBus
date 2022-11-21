package com.Redbus.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookBusTravel {
	//button[contains(text(),"Accept All")]----alert
	WebDriver driver;
	public  BookBusTravel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),\"Accept All\")]")
	private WebElement acceptbtn;
	
	@FindBy(xpath="//input[@id='src']")
	private WebElement fromclick;
	
	@FindBy(xpath="//div[contains(text(),\"Mysore, Karnataka, India\")]")
	private WebElement selectdd;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement destclick;
	
	@FindBy(xpath="//div[contains(text(),\"Hassan, Karnataka, India\")]")
	private WebElement destdd;
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement date;
	
	@FindBy(xpath="//div[contains(text(),\"November\")]/parent::div/following-sibling::span/descendant::span[contains(text(),\"28\")]")
	private WebElement selectdate;
	
	@FindBy(xpath="//div[text()=\"SEARCH\"]")
	private WebElement searchbtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAcceptbtn() {
		return acceptbtn;
	}

	public WebElement getFromclick() {
		return fromclick;
	}

	public WebElement getSelectdd() {
		return selectdd;
	}

	public WebElement getDestclick() {
		return destclick;
	}

	public WebElement getDestdd() {
		return destdd;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	}

