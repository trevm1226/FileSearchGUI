import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainWindowController {
    @FXML private Button PickButton;

    @FXML public void initialize()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));

        try{
            Parent node = loader.load();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    @FXML public void OpenFileExplorer()
    {

    }
}