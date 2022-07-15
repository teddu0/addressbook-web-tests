package tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() throws InterruptedException {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm();
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToMainPage();
    }

}
 /* driver.findElement(By.xpath("//a[@href='edit.php']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).clear();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test1");

        driver.findElement(By.xpath("//input[@name='lastname']")).click();
        driver.findElement(By.xpath("//input[@name='lastname']")).clear();
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test2");

        driver.findElement(By.xpath("//textarea[@name='address']")).click();
        driver.findElement(By.xpath("//textarea[@name='address']")).clear();
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Test3");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='submit'][1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@href='index.php']"));
        Thread.sleep(3000);*/