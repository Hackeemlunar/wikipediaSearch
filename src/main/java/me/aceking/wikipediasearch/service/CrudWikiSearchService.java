package me.aceking.wikipediasearch.service;

import javafx.collections.ObservableList;
import me.aceking.wikipediasearch.model.SearchResult;
import me.aceking.wikipediasearch.repository.WikiSearchRepository;

import java.util.List;

public class CrudWikiSearchService {
    private WikiSearchRepository searchRepository;
    public CrudWikiSearchService() {
        searchRepository = WikiSearchRepository.getInstance();
    }

    public List<SearchResult> search(String title) {
        return searchRepository.search(title);
    }

    public void save(String title, String snippet, String url) {
        // save the search result
    }

    public void delete(String title) {
        // delete the search result
    }

    public void update(String title, String snippet, String url) {
        // update the search result
    }
}
