package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.xpath("//input[@name='firstname']"), contactData.getFirstName());
        type(By.xpath("//input[@name='lastname']"), contactData.getLastName());
        type(By.xpath("//textarea[@name='address']"), contactData.getAddress());
    }

    public void submitContactCreation() {
        click(By.xpath("//input[@name='submit'][1]"));
    }

    public void returnToMainPage() {
        click(By.xpath("//a[@href='index.php']"));
    }

    public void editContact() {
        click(By.xpath("//img[@title='Edit']"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update'][2]"));
    }

    public void selectContact() {
        click(By.xpath("//input[@name='selected[]']"));
    }

    public void deleteSelectionContact() {
        click(By.xpath("//input[@value='Delete']"));
        submitAlert();
    }

    public void submitAlert() {
        driver.switchTo().alert().accept();
    }
}
