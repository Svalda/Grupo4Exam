package testMobile;

import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * Faviola Salgado
 */

public class TestNote {

    MainActivity mainActivity = new MainActivity();

    @Test
    public void verifyAddNote() throws MalformedURLException {
        mainActivity.addNoteButton.click();
        mainActivity.noteTitle.type("Reunion de trabajo");
        mainActivity.saveButton.click();


        // Verification create note

        String actualResult = mainActivity.resultLabel.getText();
        String expectedResult = "Reunion de trabajo";

        Assert.assertEquals("ERROR ! ",expectedResult,actualResult);


    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }



}
