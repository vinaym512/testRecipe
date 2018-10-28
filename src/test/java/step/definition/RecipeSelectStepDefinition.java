package step.definition;

import action.RecipeSelectActions;
import action.ShoppingListActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RecipeSelectStepDefinition {

	@Given("^I navigate to url \"([^\"]*)\"$")
	public static void openURL(String url) {
	    RecipeSelectActions.openPage(url);
	}

	@When("^I click on the first recipe$")
    public static void clickARecipe() throws InterruptedException {
        RecipeSelectActions.clickRecipe();
    }

    @Then("^I verify that recipe details opens$")
    public void verifyRecipeDetails() {
        RecipeSelectActions.verifyRecipeDetails();
    }

    @And("^I click on Manage Recipe and select Add to shopping list$")
        public void clickManageRecipeShoppingList() {
            RecipeSelectActions.addToShoppingList();
        }

    @And("^I verify that recipe ingredient added to shopping list$")
    public void verifyShoppingList() {
        ShoppingListActions.verifyShoppingListItem("Chicken Portions (4)");
    }

}