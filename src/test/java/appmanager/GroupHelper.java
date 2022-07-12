package appmanager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {

   WebDriver driver;

   public GroupHelper (WebDriver webDriver){
       this.driver = webDriver;
   }
    public void initGroupCreation() {
        driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void returnToGroupForm() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }
}
