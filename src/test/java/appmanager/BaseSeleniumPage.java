package appmanager;

import org.openqa.selenium.WebDriver;

 public class BaseSeleniumPage {
    public static WebDriver driver;
    public static void setDriver(WebDriver webDriver){
        driver = webDriver;

    }
}
