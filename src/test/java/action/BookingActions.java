    package action;

    import utils.ReusableUtils;
    import page.object.BookingPageObjects;

    public class BookingActions extends ReusableUtils {
        static int existingBookings = 0;

        public static void openPage(String url) {
            ReusableUtils.openWebPage(url);
        }

        public static void fillTheForm() {
            existingBookings =  findElements(BookingPageObjects.rows).size();
            elementSetText(BookingPageObjects.fName,"Maurice");
            elementSetText(BookingPageObjects.lName,"Green");
            elementSetText(BookingPageObjects.price,"250");
            selectFromDropdownByName(BookingPageObjects.deposite,"false");
            elementSetText(BookingPageObjects.checkIn,"2019-08-19");
            elementSetText(BookingPageObjects.checkOut,"2019-09-29");
        }

        public static void clickSaveBtn() {
            waitForElementClickable(BookingPageObjects.saveBtn);
            clickElement(BookingPageObjects.saveBtn);
        }

        public static void verifyNewBooking() {
            refreshPage();
            int updatedBookings = findElements(BookingPageObjects.rows).size();

            if(updatedBookings != existingBookings + 1){
                throw new Error("Booking not successful");
            }
        }

        public static void clickLastDeleteBtn() {
            existingBookings = findElements(BookingPageObjects.rows).size();
            clickElement(BookingPageObjects.deleteBtn(existingBookings-1));
        }

        public static void verifyBookingDeleted() {
            refreshPage();
            int updatedBookings = findElements(BookingPageObjects.rows).size();
            if(existingBookings != updatedBookings + 1){
                throw new Error("Booking deletion not successful");
            }
        }
    }