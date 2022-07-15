package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper (WebDriver webDriver){
        super(webDriver);
    }

    public void initContactCreation(){
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm() {
        type(By.xpath("//input[@name='firstname']"), "Test1");
        type(By.xpath("//input[@name='lastname']"), "Test2");
        type(By.xpath("//textarea[@name='address']"), "Test3");
    }

    public void submitContactCreation () {
        click(By.xpath("//input[@name='submit'][1]"));
    }

    public void returnToMainPage () {
        click(By.xpath("//a[@href='index.php']"));
    }
}
