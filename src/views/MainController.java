package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button mathsAidButton;
    @FXML
    private Button practiceButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void buttonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Scene playScene;
        Stage window;

        if (event.getSource() == mathsAidButton){
            loader.setLocation(getClass().getResource("fxml/NicknameScreen.fxml"));
            loader.setController(new NicknameController());
            Parent view = loader.load();
            playScene = new Scene(view);
            window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setWidth(500);
            window.setHeight(300);
            window.setScene(playScene);
            window.show();
        }

        else if (event.getSource() == practiceButton){
            loader.setLocation(getClass().getResource("fxml/PracticeDifficulty.fxml"));
            loader.setController(new PracticeDifficultyController());
            Parent view = loader.load();
            playScene = new Scene(view);
            window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(playScene);
            window.show();
        }
    }
}
