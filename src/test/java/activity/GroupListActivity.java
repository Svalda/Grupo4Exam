package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class GroupListActivity {


    public Button addButton;
    public TextBox textTitle;
    public Button saveButton;
    public Button resultGroup;

    public GroupListActivity(){
        addButton = new Button(By.id("lauresprojects.com.tareas:id/button_mas"));
        textTitle = new TextBox(By.id("lauresprojects.com.tareas:id/input_name"));
        saveButton =new Button(By.xpath("//android.widget.Button[@text='GUARDAR']"));
        resultGroup = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView"));

    }
}


