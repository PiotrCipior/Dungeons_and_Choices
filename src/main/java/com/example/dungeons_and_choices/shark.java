package com.example.dungeons_and_choices;

import com.example.dungeons_and_choices.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

public class shark
{
    @FXML private Button button;
    @FXML private Button button1;
    @FXML private Text ect;
    @FXML
    protected void putIn(ActionEvent event) throws IOException {
        button.setVisible(false);
        button.setDisable(true);
        button1.setVisible(false);
        button1.setDisable(true);
        ect.setVisible(true);
    }
    @FXML
    protected void dontPutIn(ActionEvent event) throws IOException {
        //SceneController.switchToScene(event,"sharkScene");
    }
}
