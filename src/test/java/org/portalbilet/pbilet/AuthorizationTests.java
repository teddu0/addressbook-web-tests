package org.portalbilet.pbilet;

import jdk.jfr.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTests extends Base {

    private final static String BASE_URL = "https://portalbilet.pbilet.org/en/login";
    private final static String EMAIL = "testeam@internet.ru";
    private final static String CORRECT_PASSWORD = "testeam@internet.ru";
    private final static String INCORRECT_PASSWORD = "testeam@internet.com";

    LoginPage l = new LoginPage();

    @Test
    @Label("Авторизация по валидным данным")
    public void validLogin() throws InterruptedException {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(l.loginBtn)).click();
        driver.findElement(By.xpath(l.emailField)).sendKeys(EMAIL);
        driver.findElement(By.xpath(l.passField)).sendKeys(CORRECT_PASSWORD);
        driver.findElement(By.xpath(l.submitBtn)).click();
        Thread.sleep(4000);
        WebElement getH1 = driver.findElement(By.xpath(l.h1Profile));
        Assert.assertEquals(getH1.getText(), "Profile");
    }

    @Test
    @Label("Авторизация по невалидному паролю")
    public void invalidLogin() throws InterruptedException {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(l.loginBtn)).click();
        driver.findElement(By.xpath(l.emailField)).sendKeys(EMAIL);
        driver.findElement(By.xpath(l.passField)).sendKeys(INCORRECT_PASSWORD);
        driver.findElement(By.xpath(l.submitBtn)).click();
        Thread.sleep(2000);
        WebElement notice = driver.findElement(By.xpath(l.noticeIncorrectPass));
        Assert.assertEquals(notice.getText(), "Invalid password");
    }


}

