package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() throws InterruptedException {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Test1", "Test2", "Test3"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToMainPage();
        Thread.sleep(3000);
    }

}