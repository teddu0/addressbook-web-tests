package org.portalbilet.pbilet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    public WebDriver driver;
    private final static String BASE_URL = "https://portalbilet.pbilet.org/en/login";
    private final static String EMAIL = "testeam@internet.ru";
    private final static String CORRECT_PASSWORD = "testeam@internet.ru";
    LoginPage l = new LoginPage();

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get(BASE_URL);
        l.login(EMAIL, CORRECT_PASSWORD);
        Thread.sleep(3000);
    }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    //кнопка перехода к данным для выплат
    public void setIndividualInfo() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/aside/ul/li[4]/button")).click();
    }
    // Поля формы для физ. лиц
    public void enterParamsForIndividual(String name, String address, String bank_details, String phone_number, String email, String date_of_birth, String passport_data){
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("bank_details")).sendKeys(bank_details);
        driver.findElement(By.name("phone_number")).sendKeys(phone_number);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("date_of_birth")).sendKeys(date_of_birth);
        driver.findElement(By.name("passport_data")).sendKeys(passport_data);
    }

    // Поля формы для юр. лиц
    public void enterParamsForLegals(String name, String registration_number, String address, String document_name, String bank_details, String phone_number, String email){
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("registration_number")).sendKeys(registration_number);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("document_name")).sendKeys(document_name);
        driver.findElement(By.name("bank_details")).sendKeys(bank_details);
        driver.findElement(By.name("phone_number")).sendKeys(phone_number);
        driver.findElement(By.name("email")).sendKeys(email);
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
