package tests;

import model.ContactData;
import model.GroupData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        Thread.sleep(2000);
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Test1", "Test2","Test3"));
        }
        app.getNavigationHelper().goToHomePage();
        if(! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Test1", "Test1", "Test1","Test1"));
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Test1", "Test2", "Test3", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToMainPage();
        Thread.sleep(2000);
    }
}
