package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EmailTemplatePage {

	private WebDriver driver;

	// 1. By Locators:
	private By create_an_Email_Template = By.xpath("//span[text()='Create an Email Template']");
	private By enter_Title = By.xpath("//label[text()='Title']/following::input");
	private By enter_Subject = By.xpath("//label[text()='Subject']/following::input");
	private By enter_Message = By.xpath("//body[@id='tinymce']");
	private By dynamic_Field_For_Subject = By.xpath("//button[@class='btn browseKeywords']");
	private By dynamic_Field_Lists = By.xpath("//div[@class='keywordList']/ul/li");
	private By dynamic_Field_For_Message = By.xpath("//div[@class='createEmailButtons']/button[1]");
	private By save = By.xpath("//button[text()='Save ']");

	// 2. Constructor of the page class:
	public EmailTemplatePage(WebDriver edriver) {
		this.driver = edriver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void emailTemplatePageURL() throws InterruptedException {
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("email-template"));
	}

	public void createEmailTemplate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(create_an_Email_Template).click();
	}

	public void enterTitle(String title) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(enter_Title).sendKeys(title);
	}

	public void enterSubject(String subject) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(enter_Subject).sendKeys(subject);
		driver.findElement(dynamic_Field_For_Subject).click();
		List<WebElement> keywordList = driver.findElements(dynamic_Field_Lists);
		for (int i = 1; i <= keywordList.size(); i++) {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='keywordList']/ul/li[" + i + "]/button")).click();
		}
	}

	public void enterMessage(String message) throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(enter_Message).sendKeys(message);
		driver.switchTo().defaultContent();
		driver.findElement(dynamic_Field_For_Message).click();
		List<WebElement> keywordList = driver.findElements(dynamic_Field_Lists);
		for (int i = 1; i <= keywordList.size(); i++) {
			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='keywordList']/ul/li[" + i + "]/button")).click();
		}
	}

	public void clickSave() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(save).click();
	}

	public void clickEmail() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='listDropBtn']//img[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='email']")).click();
	}

	public void enterEmailID(String emailID) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailID);

	}

	public EmailTemplatePage selectTEmplate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='cmnFieldStyle btnSelect']")).click();
		driver.findElement(By.xpath("//ul[@class='showTemplateName']//li[1]")).click();
		return this;
	}

	public void sendEmai() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Send Email ']")).click();
	}

}
