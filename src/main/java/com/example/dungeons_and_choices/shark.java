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
    @FXML private Button next;
    @FXML private Text choice;
    @FXML
    protected void putIn(ActionEvent event) throws IOException {
        values.sharkAmulet = true;
        button.setVisible(false);
        button.setDisable(true);
        button1.setVisible(false);
        button1.setDisable(true);
        choice.setText("""
                Sięgasz mu do paszczy błagając o to żeby przypadkiem akurat teraz nie postanowił odgryźć Ci ręki… Łapiesz za ząb, pod palcami czujesz że końcówka jest ostra jak szpilka, ale za to na boku czujesz wyżłobienia… Pociągasz lekko i o dziwo, tyle siły wystarczyło. Patrzysz na zdobycz i widzisz napisy oraz sznurek przewiązany za grubszy koniec.""");
        choice.setVisible(true);
        next.setDisable(false);
        next.setVisible(true);

    }
    @FXML
    protected void dontPutIn(ActionEvent event) throws IOException {
        values.deerMask = true;
        button.setVisible(false);
        button.setDisable(true);
        button1.setVisible(false);
        button1.setDisable(true);
        choice.setText("""
                Sięgasz mu do paszczy błagając o to żeby przypadkiem akurat teraz nie postanowił odgryźć Ci ręki… Łapiesz za ząb, pod palcami czujesz że końcówka jest ostra jak szpilka, ale za to na boku czujesz wyżłobienia… Pociągasz lekko i o dziwo, tyle siły wystarczyło. Patrzysz na zdobycz i widzisz napisy oraz sznurek przewiązany za grubszy koniec.""");
        choice.setVisible(true);
        next.setDisable(false);
        next.setVisible(true);
    }
    @FXML
    protected void run(ActionEvent event) throws IOException {
        //SceneController.switchToScene(event,"sharkScene");
    }
}
