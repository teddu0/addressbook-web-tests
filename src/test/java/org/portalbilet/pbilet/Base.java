package org.portalbilet.pbilet;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.lang.module.Configuration;
import java.util.concurrent.TimeUnit;


public class Base {
    public WebDriver driver;

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @BeforeTest
    public void init() {
        setUp();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
