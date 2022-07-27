package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testDeletionContact() throws InterruptedException {
        app.getNavigationHelper().goToHomePage();
        if(! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Test1", "Test1", "Test1","Test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectionContact();
        Thread.sleep(3000);
    }
}
