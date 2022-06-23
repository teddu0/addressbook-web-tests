package tests;

import appmanager.ApplicationManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseSeleniumTest {
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterTest
    public void tearDown() {
        app.stop();
    }

}
