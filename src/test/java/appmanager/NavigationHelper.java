package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToGroupPage() {
        click(By.xpath("//a[@href='group.php']"));
    }

    public void goToHomePage() {
        click(By.xpath("//a[@href='./']"));
    }
}
