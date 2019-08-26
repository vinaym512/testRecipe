package page.object;

import org.openqa.selenium.By;

public class BookingPageObjects {

	public static By rows = By.xpath("//*[@id='bookings']//*[@class='row']");
	public static By fName = By.id("firstname");
	public static By fNames = By.xpath("//*[@class=\"row\"]//div[@class='col-md-2'][1]");

	public static By lName = By.id("lastname");
	public static By price = By.id("totalprice");
	public static By deposite = By.id("depositpaid");
	public static By checkIn = By.id("checkin");
	public static By checkOut = By.id("checkout");
	public static By saveBtn = By.xpath("//*[@type='button' and @value=' Save ']");
	public static By deleteBtn(int rowNumber) { return By.xpath("(//*[@id='bookings']//input[@type='button'])["+rowNumber+"]");};


	public static By headerName = By.xpath("//*[@class='navbar-brand']");
	public static By imageId = By.xpath("//*[@class='img-responsive shadow']");
	public static By ingredientId = By.xpath("//*[@class='list-group']");
	public static By dropdownId = By.xpath("//*[contains(@class,'dropdown-toggle')]");
	public static By dropdown1stItemId = By.xpath("//*[@id='dropdown']/li[1]/button");

}

