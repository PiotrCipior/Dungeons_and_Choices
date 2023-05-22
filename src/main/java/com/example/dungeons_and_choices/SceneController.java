package com.example.dungeons_and_choices;

import com.almasb.fxgl.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private static Stage stage;
    private static javafx.scene.Scene scene;
    private static FXMLLoader fxmlLoader;

    public static void switchToScene1(ActionEvent event, String sceneName) throws IOException
    {
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(sceneName+".fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new javafx.scene.Scene(fxmlLoader.load(), 600, 600);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void shark(ActionEvent event) throws IOException {
        SceneController.switchToScene1(event,"FirstScene");
    }
}
