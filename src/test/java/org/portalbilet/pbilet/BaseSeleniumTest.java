package org.portalbilet.pbilet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static org.portalbilet.pbilet.BaseSeleniumPage.driver;

public class BaseSeleniumTest {
    public WebDriver driver;
    private final static String BASE_URL = "https://portalbilet.pbilet.org/en/login";
    private final static String EMAIL = "testeam@internet.ru";
    private final static String CORRECT_PASSWORD = "testeam@internet.ru";
    LoginPage l = new LoginPage();

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get(BASE_URL);
        l.login(EMAIL, CORRECT_PASSWORD);
        Thread.sleep(3000);
    }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
