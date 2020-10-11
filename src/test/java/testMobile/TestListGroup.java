package testMobile;

import activity.GroupListActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class TestListGroup {

     GroupListActivity groupListActivity = new GroupListActivity();

    @Test
    public void verifyAddNoteList() throws MalformedURLException {
        groupListActivity.addButton.click();
        groupListActivity.textTitle.type("Compras");
        groupListActivity.saveButton.click();


        // Verification creacion de una lista

        String actualResult = groupListActivity.resultGroup.getText();
        String expectedResult = "COMPRAS";

        Assert.assertEquals("ERROR ! ",expectedResult,actualResult);


    }
    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}

