package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper (WebDriver webDriver){
        super(webDriver);
    }

    public void initContactCreation(){
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.xpath("//input[@name='firstname']"), contactData.getFirstName());
        type(By.xpath("//input[@name='lastname']"), contactData.getFirstName());
        type(By.xpath("//textarea[@name='address']"), contactData.getAddress());
    }

    public void submitContactCreation () {
        click(By.xpath("//input[@name='submit'][1]"));
    }

    public void returnToMainPage () {
        click(By.xpath("//a[@href='index.php']"));
    }
}
