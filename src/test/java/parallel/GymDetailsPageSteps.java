package parallel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;

public class GymDetailsPageSteps {

	private DashboardPage dashPage = new DashboardPage(DriverFactory.getDriver());
	
	@Given("^user has already logged in to application$")
    public void user_has_already_logged_in_to_application() throws Throwable {
		// throw new io.cucumber.java.PendingException();
    }

    @Given("^User Launch Chrome browser$")
    public void user_launch_chrome_browser() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @When("^User Opens URL \"([^\"]*)\"$")
    public void user_opens_url_something(String strArg1) throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @Then("^Page Title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String strArg1) throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @Then("^User will click on general settings$")
    public void user_will_click_on_general_settings() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @Then("^User will fill up all fields$")
    public void user_will_fill_up_all_fields() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @Then("^User will click on upload and select any png or jpg file$")
    public void user_will_click_on_upload_and_select_any_png_or_jpg_file() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @Then("^User must see the edit button beside the name of the gym$")
    public void user_must_see_the_edit_button_beside_the_name_of_the_gym() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^User will Enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_will_enter_email_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^User will click on Login button$")
    public void user_will_click_on_login_button() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^User will click on gym details$")
    public void user_will_click_on_gym_details() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^Accordingly User will click on Edit button$")
    public void accordingly_user_will_click_on_edit_button() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^Finally click on Save$")
    public void finally_click_on_save() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }

    @And("^Update the details$")
    public void update_the_details() throws Throwable {
    	// throw new io.cucumber.java.PendingException();
    }
	
}
