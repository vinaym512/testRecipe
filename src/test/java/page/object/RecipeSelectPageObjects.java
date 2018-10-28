package page.object;

import org.openqa.selenium.By;

public class RecipeSelectPageObjects {

	public static By recipe = By.xpath("//*[@href='/recipes/0']");
	public static By headerName = By.xpath("//*[@class='navbar-brand']");
	public static By imageId = By.xpath("//*[@class='img-responsive shadow']");
	public static By ingredientId = By.xpath("//*[@class='list-group']");
	public static By dropdownId = By.xpath("//*[contains(@class,'dropdown-toggle')]");
	public static By dropdown1stItemId = By.xpath("//*[@id='dropdown']/li[1]/button");

}

