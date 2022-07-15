package tests.forContacts;

import model.ContactData;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import tests.TestBase;

import java.util.concurrent.TimeUnit;

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