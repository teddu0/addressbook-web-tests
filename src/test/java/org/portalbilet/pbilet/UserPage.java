package org.portalbilet.pbilet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.portalbilet.pbilet.BaseSeleniumPage.driver;

public class UserPage {

    public void setIndividualInfo() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/aside/ul/li[4]/button")).click();
    }

    public void enterParamsForIndividual(String name, String address, String bank_details, String phone_number, String email, String date_of_birth, String passport_data){
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("bank_details")).sendKeys(bank_details);
        driver.findElement(By.name("phone_number")).sendKeys(phone_number);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("date_of_birth")).sendKeys(date_of_birth);
        driver.findElement(By.name("passport_data")).sendKeys(passport_data);
    }

    public void enterParamsForLegals(String name, String registration_number, String address, String document_name, String bank_details, String phone_number, String email){
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("registration_number")).sendKeys(registration_number);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("document_name")).sendKeys(document_name);
        driver.findElement(By.name("bank_details")).sendKeys(bank_details);
        driver.findElement(By.name("phone_number")).sendKeys(phone_number);
        driver.findElement(By.name("email")).sendKeys(email);
    }
    public void submit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement notice = driver.findElement(By.xpath("//div[@role='alert']"));
        Assert.assertEquals(notice.getText(), "Data sent successfully!");

    }

    public void switchToLegalEntity () {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/div/div/form/div[2]/label")).click();
    }
}
