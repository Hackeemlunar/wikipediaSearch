package me.aceking.wikipediasearch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import me.aceking.wikipediasearch.repository.WikiSearchRepository;

import java.util.Objects;

public class WikiSearchApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass()
                .getResource("/me/aceking/wikipediasearch/fxml/wikiview.fxml")));
        Scene scene = new Scene(root, 800,800, Color.LIGHTYELLOW);
        scene.getStylesheets().add(getClass()
                .getResource("/me/aceking/wikipediasearch/style/styles.css").toExternalForm());
        stage.setTitle("Wikipedia Search");
        stage.setScene(scene);
        stage.show();
    }
}
