package com.example.dungeons_and_choices;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        SceneController.switchToScene(event,"FirstScene");
    }
    @FXML
    protected void shark(ActionEvent event) throws IOException {
        SceneController.switchToScene(event,"sharkScene");
    }
    @FXML
    protected void hooligans(ActionEvent event) throws IOException {
        SceneController.switchToScene(event,"FirstScene");
    }
    @FXML
    protected void ministrel(ActionEvent event) throws IOException {
        SceneController.switchToScene(event,"FirstScene");
    }
    @FXML
    protected void beer(ActionEvent event) throws IOException {
        SceneController.switchToScene(event,"FirstScene");
    }
}