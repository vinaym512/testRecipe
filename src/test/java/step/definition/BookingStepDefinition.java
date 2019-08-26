package step.definition;

import action.BookingActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BookingStepDefinition {

	@Given("^I navigate to url \"([^\"]*)\"$")
	public static void openURL(String url) {
	    BookingActions.openPage(url);
	}

	@When("^I fill the form with booking details$")
    public static void fillTheForm() {
        BookingActions.fillTheForm();
    }

@And("^I click save button$")
    public static void clickSave() {
        BookingActions.clickSaveBtn();
    }

    @Then("^I verify that booking has successfully added$")
    public void verifyBooking() {
        BookingActions.verifyNewBooking();
    }

    @When("^I click Delete button of last booking$")
    public static void clickDelete() {
        BookingActions.clickLastDeleteBtn();
    }
    @Then("^I verify that the booking has successfully deleted$")
    public void verifyBookingDelete() {
        BookingActions.verifyBookingDeleted();
    }

}