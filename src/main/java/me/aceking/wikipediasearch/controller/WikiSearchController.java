package me.aceking.wikipediasearch.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Screen;
import me.aceking.wikipediasearch.model.SearchResult;
import me.aceking.wikipediasearch.service.CrudWikiSearchService;

import java.util.List;

public class WikiSearchController {
    CrudWikiSearchService crudWikiSearchService = new CrudWikiSearchService();
    @FXML
    private ListView<TextArea> resultsview;
    @FXML
    private TextField searchBox;
    @FXML
    private Button searchButton;

    @FXML
    protected void onHelloButtonClick() {
        ObservableList<TextArea> searchResults = FXCollections.observableArrayList();
        List<SearchResult> searchResultList = crudWikiSearchService.search(searchBox.getText());
        searchResultList.forEach(searchResult -> {
            String info = String.format("Title: %s\nSnippet: %s\n%s", searchResult.getTitle(),
                    searchResult.getSnippet(), searchResult.getUrl());
            TextArea text = new TextArea(info);
            text.setWrapText(true);
            searchResults.add(text);
        });
        cjangeResultsView();
        searchBox.setVisible(false);
        searchButton.setVisible(false);
        resultsview.setItems(searchResults);
    }

    private void cjangeResultsView() {
        resultsview.setVisible(true);
        resultsview.setMaxHeight(Screen.getPrimary().getVisualBounds().getHeight());
        resultsview.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    }
}