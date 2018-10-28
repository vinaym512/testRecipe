package step.definition;

import action.ShoppingListActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShoppingListStepDefinition {

	@When("^I click on a shopping item on shopping list page$")
	public static void clickShoppingItem() {

	    ShoppingListActions.clickShoppingList();
	}

	@Then("^Shopping item is loaded to the edit box$")
    public static void verifyItemLoaded() {

        ShoppingListActions.verifyItemLoaded();
    }

    @When("^I change the name of the item and click on update$")
    public void verifyRecipeDetails() {

	    ShoppingListActions.changeItemName("New Item");
	    ShoppingListActions.clickUpdateBtn();
    }

    @Then("^I verify that Item name changed in the list$")
        public void VerifyItemNameChanged() {
        ShoppingListActions.verifyShoppingListItem("New Item");
        }

}