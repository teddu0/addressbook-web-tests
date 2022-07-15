package tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testDeletionContact() throws InterruptedException {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectionContact();
        Thread.sleep(3000);
    }
}
