package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;

public class DashboardPageSteps {

	private static String dash_title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> credList = dataTable.asMaps();

		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver().get("https://www.redbeltgym.com/login");
		dashPage = loginPage.doLogin(userName, password);
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Dashboard page")
	public void user_is_on_dashboard_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		Thread.sleep(10000);
//		String title = dashPage.getDashPageTitle();
//		System.out.println("Dashboard Page title is: " + title);
		// dashPage.selectMonthadd_rvn();

		dash_title = dashPage.getDashPageTitle();
		System.out.println("dashboard page title is:" + dash_title);
		// throw new io.cucumber.java.PendingException();
	}

	@Then("Dashboard page title should be {string}")
	public void Dashboard_page_title_should_be(String expectedTitle) {

		Assert.assertTrue(dash_title.contains(expectedTitle));

	}

	@Then("user selects previous month in additional revenue")
	public void user_selects_previous_month_in_additional_revenue() throws InterruptedException {

		Thread.sleep(10000);
		dashPage.selectMonthadd_rvn();

	}

	@Then("Click on the setup menu which is in the top right side")
	public void click_on_the_setup_menu_which_is_in_the_top_right_side() throws InterruptedException {
		dashPage.clicksetup();
	}

	@Then("Click on Email Templates")
	public void click_on_email_templates() throws InterruptedException {
		dashPage.clickEmailTemplates();
	}

	@Then("Click on Option dropdown select Email")
	public void click_on_option_dropdown_select_email() throws Throwable {
		dashPage.clickEmail();
	}

	@Then("Enter Email ID {string} to send an Email")
	public void enter_email_id_to_send_an_email(String emailid) throws Throwable {
		dashPage.enterEmailID(emailid);
	}

	@Then("Select from template")
	public void select_from_template() throws Throwable {
		dashPage.selectTemplate();
	}

	@Then("Click on Send Email")
	public void click_on_send_email() throws Throwable {
		dashPage.sendEmail();
	}

}
