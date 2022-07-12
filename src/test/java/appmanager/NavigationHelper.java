package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper (WebDriver webDriver) {
        this.driver = webDriver;
    }
    public void goToGroupPage() {
        driver.findElement(By.xpath("//a[@href='group.php']")).click();
    }
}
