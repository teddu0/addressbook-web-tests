package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification () throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Mod1", "Mod2", "Mod3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupForm();
        Thread.sleep(2000);

    }

}
