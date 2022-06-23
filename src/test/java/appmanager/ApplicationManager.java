package appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.BACK_SPACE;
import static org.openqa.selenium.Keys.HOME;
import static appmanager.BaseSeleniumPage.driver;

public class ApplicationManager {

    private final static String BASE_URL = "https://portalbilet.pbilet.org/en/login";
    private final static String EMAIL = "k.volkov@portalbilet.ru";
    private final static String CORRECT_PASSWORD = "Langress23";

    public void init() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get(BASE_URL);
        login(EMAIL, CORRECT_PASSWORD);
        Thread.sleep(3000);
    }

    public void stop() {
        driver.close();
        driver.quit();
    }

    public void login(String email, String password) {
        driver.findElement(By.xpath("//button[@data-selenium='auth-with-email']")).click();
        driver.findElement(By.xpath("//input[@data-selenium='auth-email-input']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@data-selenium='auth-password-input']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@data-selenium='auth-submit']")).click();
    }

    //кнопка перехода к данным для выплат
    public void setIndividualInfo() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/aside/ul/li[4]/button")).click();
    }

    // Поля формы для физ. лиц
    public void enterParamsForIndividual(String name, String address, String bank_details, String phone_number, String email, String date_of_birth, String passport_data){
        driver.findElement(By.name("name")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (name));;
        driver.findElement(By.name("address")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (address));
        driver.findElement(By.name("bank_details")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (bank_details));
        driver.findElement(By.name("phone_number")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (phone_number));
        driver.findElement(By.name("email")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (email));
        driver.findElement(By.name("date_of_birth")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (date_of_birth));
        driver.findElement(By.name("passport_data")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (passport_data));
    }

    // Поля формы для юр. лиц
    public void enterParamsForLegals(String name, String registration_number, String address, String document_name, String bank_details, String phone_number, String email){
        driver.findElement(By.name("name")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (name));
        driver.findElement(By.name("registration_number")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (registration_number));
        driver.findElement(By.name("address")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (address));
        driver.findElement(By.name("document_name")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (document_name));
        driver.findElement(By.name("bank_details")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (bank_details));
        driver.findElement(By.name("phone_number")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (phone_number));
        driver.findElement(By.name("email")).sendKeys(Keys.SHIFT, HOME, BACK_SPACE, (email));
    }

    // Кнопка сохрания формы и получение флажка уведомления о сохранении поля
    public void submit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement notice = driver.findElement(By.xpath("//div[@role='alert']"));
        Assert.assertEquals(notice.getText(), "Data sent successfully!");
    }

    public void switchToLegalEntity () {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/div/div/form/div[2]/label")).click();
    }
}
