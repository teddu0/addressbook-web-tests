package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper (WebDriver webDriver) {
        super(webDriver);
    }
    public void goToGroupPage() {
        driver.findElement(By.xpath("//a[@href='group.php']")).click();
    }

}
