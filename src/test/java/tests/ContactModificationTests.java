package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() throws InterruptedException {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Hello", null, null));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToMainPage();
        Thread.sleep(2000);
    }
}
