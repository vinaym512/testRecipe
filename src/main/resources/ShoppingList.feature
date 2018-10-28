@ShoppingList
Feature: I want to verify the recipe page functionality
  @ShoppingItemUpdate
  Scenario: I want to update a shopping item which is already added
    Given I navigate to url "https://receipe-app.herokuapp.com/recipes"
      And I click on the first recipe
      And I click on Manage Recipe and select Add to shopping list
      And I verify that recipe ingredient added to shopping list
     When I click on a shopping item on shopping list page
     Then Shopping item is loaded to the edit box
     When I change the name of the item and click on update
     Then I verify that Item name changed in the list

