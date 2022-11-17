package com.Redbus.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Accept All']")
	private WebElement click;
	
	@FindBy(xpath="//div[@class='source input-box ']/descendant::input[@class='sc-jKJlTe hXQqIt']")
	private WebElement from;

	@FindBy(xpath="//div[text()='Bangalore, Karnataka, India']")
	private WebElement fromclick;

	@FindBy(xpath="//div[@class='destination input-box']/descendant::input[@class='sc-jKJlTe hXQqIt']")
	private WebElement to;

	@FindBy(xpath="//div[text()='Mumbai, Maharashtra, India']")
	private WebElement toclick;
	
	@FindBy(xpath="//input[@class='rdc-db' and @id='onward_cal']")
	private WebElement fromdateclick;
	@FindBy(xpath="//div[text()='November']/ancestor::div[@class='DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP']/descendant::span[text()='25']")
	private WebElement fromdate;
	@FindBy(xpath="//input[@id='r-date']")
	private WebElement todateclick;
	@FindBy(xpath="//div[text()='November']/ancestor::div[@class='DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP']/descendant::span[text()='30']")
	private WebElement todate;
	@FindBy(xpath="//div[@class='search-lbl']")
	private WebElement search;
	
	public WebElement getClick() {
		return click;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getFromclick() {
		return fromclick;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getToclick() {
		return toclick;
	}
	public WebElement getFromdateclick() {
		return fromdateclick;
	}
	public WebElement getFromdate() {
		return fromdate;
	}
	public WebElement getTodateclick() {
		return todateclick;
	}
	public WebElement getTodate() {
		return todate;
	}
	public WebElement getSearch() {
		return search;
	}
	public void addredbus() throws InterruptedException {
		click.click();
		Thread.sleep(5000);
		from.click();
		from.sendKeys("bangalore");
		Thread.sleep(5000);
		fromclick.click();
		Thread.sleep(5000);
		to.sendKeys("mumbai");
		Thread.sleep(5000);
		toclick.click();
		Thread.sleep(5000);
		fromdateclick.click();
		Thread.sleep(5000);
		fromdate.click();
		todateclick.click();
		todate.click();
		search.click();
	}
	}


