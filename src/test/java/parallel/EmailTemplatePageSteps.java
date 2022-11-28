package parallel;

import com.pages.EmailTemplatePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EmailTemplatePageSteps {

	private EmailTemplatePage EmailTemplatePage = new EmailTemplatePage(DriverFactory.getDriver());

	@Then("Email Template page should be displayed")
	public void email_template_page_should_be_displayed() throws Throwable {
		EmailTemplatePage.emailTemplatePageURL();
	}

	@Then("Click on Create an Email Template button")
	public void click_on_create_an_email_template_button() throws Throwable {
		EmailTemplatePage.createEmailTemplate();
	}

	@Then("Enter Title {string}")
	public void enter_title(String title) throws Throwable {
		EmailTemplatePage.enterTitle(title);
	}

	@Then("Enter Subject {string}")
	public void enter_subject(String subject) throws Throwable {
		EmailTemplatePage.enterSubject(subject);
	}

	@Then("Enter Message {string}")
	public void enter_message(String message) throws Throwable {
		EmailTemplatePage.enterMessage(message);
	}

	@Then("Click on Save")
	public void click_on_save() throws Throwable {
		EmailTemplatePage.clickSave();
	}

}