package org.portalbilet.pbilet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.portalbilet.pbilet.BaseSeleniumPage.driver;

public class LoginPage {
    public void login(String email, String password) {
        driver.findElement(By.xpath("//button[@data-selenium='auth-with-email']")).click();
        driver.findElement(By.xpath("//input[@data-selenium='auth-email-input']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@data-selenium='auth-password-input']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@data-selenium='auth-submit']")).click();
    }

}
