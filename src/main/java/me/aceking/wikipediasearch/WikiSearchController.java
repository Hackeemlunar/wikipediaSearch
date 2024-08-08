package me.aceking.wikipediasearch;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WikiSearchController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}