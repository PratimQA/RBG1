package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {

	private WebDriver driver;

	private By add_dropdown = By.xpath("//div[@class='widgetContent']//div[1]//div[1]//div[1]//div[2]");
	private By add_rvn_month = By.cssSelector("select[name='Additional Revenue']");
	private By setup_Menu = By.xpath("//button[@class='btn buttonHeaderIcons']");
	private By email_Template = By.xpath("//a[@href='/email-template']");
	private By dropdown_Icon = By.xpath("//button[@class='listDropBtn']//img[1]");
	private By dropdown_Email = By.xpath("//input[@value='email']");
	private By send_Email_Input = By.xpath("//input[@type='email']");
	private By dropdown_Email_Template = By.xpath("//div[@class='cmnFieldStyle btnSelect']");
	private By select_Template = By.xpath("//ul[@class='showTemplateName']//li[1]");
	private By send_Email_Button = By.xpath("//button[text()='Send Email ']");

	public DashboardPage(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public String getDashPageTitle() throws InterruptedException {
		Thread.sleep(10000);
		return driver.getTitle();
	}

	public void selectMonthadd_rvn() throws InterruptedException {

		driver.findElement(add_dropdown).click();
		Thread.sleep(10000);
		Select objSelect = new Select(driver.findElement(add_rvn_month));
		// objSelect.selectByVisibleText("August");
		objSelect.selectByValue("August");
	}

	public void clicksetup() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(setup_Menu).click();
	}

	public EmailTemplatePage clickEmailTemplates() throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(email_Template).click();
		return new EmailTemplatePage(driver);
	}

	public void clickEmail() throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(dropdown_Icon).click();
		Thread.sleep(500);
		driver.findElement(dropdown_Email).click();
	}

	public void enterEmailID(String emailID) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(send_Email_Input).sendKeys(emailID);
	}

	public void selectTemplate() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(dropdown_Email_Template).click();
		driver.findElement(select_Template).click();
	}

	public void sendEmail() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(send_Email_Button).click();
	}

}
