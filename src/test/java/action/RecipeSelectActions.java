package action;

import utils.ReusableUtils;
import org.junit.Assert;
import page.object.RecipeSelectPageObjects;
import page.object.ShoppingListPageObjects;

import java.util.List;

public class RecipeSelectActions extends ReusableUtils {

    public static void openPage(String url) {
        ReusableUtils.openWebPage(url);
    }

    public static void clickRecipe() throws InterruptedException {
        waitForElementClicable(RecipeSelectPageObjects.recipe);
        clickElement(RecipeSelectPageObjects.recipe);
    }

    public static void verifyRecipeDetails() {
        Assert.assertTrue(isElementPresent(RecipeSelectPageObjects.imageId));
        //Assert.assertTrue("Recipe details available", elementy avaialable);

        Assert.assertTrue("Ingredient displayed", isElementPresent(RecipeSelectPageObjects.ingredientId));
    }

    public static void addToShoppingList() {
        clickElement(RecipeSelectPageObjects.dropdownId);
        clickElement(RecipeSelectPageObjects.dropdown1stItemId);

    }

    public static void verifyShoppingList() {
        List<String> shopItem = null;
        shopItem = getTextFromTable(ShoppingListPageObjects.shoplistItemId);
        for (String item : shopItem) {
            Assert.assertTrue("Shopping List NOT Added", item.equalsIgnoreCase("Chicken Portions (4)"));
        }


    }
}