package activity;


import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addNoteButton;
    public TextBox noteTitle;
    public Button saveButton;
    public Button resultLabel;

    public MainActivity(){
          addNoteButton = new Button(By.id("net.fast_notepad_notes_app.fastnotepad:id/fab"));
          noteTitle = new TextBox(By.id("net.fast_notepad_notes_app.fastnotepad:id/editText"));
          saveButton =new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]"));
          resultLabel = new Button(By.id("net.fast_notepad_notes_app.fastnotepad:id/text1"));

      }


}



