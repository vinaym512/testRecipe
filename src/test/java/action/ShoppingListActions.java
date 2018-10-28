package action;

import page.object.ShoppingListPageObjects;
import utils.ReusableUtils;

import java.util.List;

public class ShoppingListActions extends ReusableUtils {
    static String shopList;

    public static void openPage(String url) {
        ReusableUtils.openWebPage(url);
    }

    public static void clickShoppingList()  {
        waitForElementClicable(ShoppingListPageObjects.shoplistItemId);
        clickElement(ShoppingListPageObjects.shoplistItemId);
        shopList = elementGetText(ShoppingListPageObjects.shoplistItemId);
    }

    public static void verifyItemLoaded() {
        System.out.println(findElement(ShoppingListPageObjects.shoplistNameId).getText());
        if(findElement(ShoppingListPageObjects.shoplistNameId).getText().equalsIgnoreCase(shopList)){
            System.out.println("========Item Loaded=========");
        }
    }

    public static void changeItemName(String newItemName) {
        findElement(ShoppingListPageObjects.shoplistNameId).clear();
        findElement(ShoppingListPageObjects.shoplistNameId).sendKeys(newItemName);
    }

    public static void clickUpdateBtn() {
        clickElement(ShoppingListPageObjects.updateBtnId);
    }

    public static void verifyShoppingListItem(String listItem) {
        List<String> shopItem = null;
        shopItem = getTextFromTable(ShoppingListPageObjects.shoplistItemId);
        for (String item : shopItem) {
            if(item.equalsIgnoreCase(listItem)) {
                System.out.println("========Item Updated=========");
            }
        }
    }
}