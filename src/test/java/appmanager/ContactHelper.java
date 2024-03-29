package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.xpath("//input[@name='firstname']"), contactData.getFirstName());
        type(By.xpath("//input[@name='lastname']"), contactData.getLastName());
        type(By.xpath("//textarea[@name='address']"), contactData.getAddress());


        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
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

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact, true);
        submitContactCreation();
        returnToMainPage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//input[@name='selected[]']"));
    }
}
