package tests;

import model.ContactData;
import model.GroupData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testDeletionContact() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Test1", "Test2","Test3"));
        }
        app.getNavigationHelper().goToHomePage();
        if(! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Test1", "Test1", "Test1","Test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectionContact();
        Thread.sleep(2000);
    }
}
