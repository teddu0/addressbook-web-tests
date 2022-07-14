package appmanager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {


   public GroupHelper (WebDriver webDriver){
        super(webDriver);
   }
    public void initGroupCreation() {
        click(By.xpath("//input[@name='new']"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreation() {
       click(By.name("submit"));
    }

    public void returnToGroupForm() {
        click(By.linkText("group page"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroups() {
       click(By.name("delete"));
    }

    public void initGroupModification() {
       click(By.xpath("//input[@value='Edit group'][1]"));
    }
    public void submitGroupModification (){
       click(By.xpath("//input[@value='Update']"));
    }
}
