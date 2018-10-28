@RecipePage
Feature: I want to verify the recipe page functionality
  @RecipeSelection
  Scenario: I select a recipe on home page
    Given I navigate to url "https://receipe-app.herokuapp.com/recipes"
     When I click on the first recipe
     Then I verify that recipe details opens

  @ManageRecipe
  Scenario: I want to add a recipe ingredient to shopping list
    Given I navigate to url "https://receipe-app.herokuapp.com/recipes"
    When I click on the first recipe
     And I click on Manage Recipe and select Add to shopping list
    Then I verify that recipe ingredient added to shopping list