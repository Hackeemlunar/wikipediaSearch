package me.aceking.wikipediasearch.repository;

import me.aceking.wikipediasearch.model.SearchResult;

import java.util.List;

public interface WikiSearchRepository {
    List<SearchResult> search(String title);
    void save(SearchResult searchResult);
    void delete(String title);
    void update(SearchResult searchResult);

    static WikiSearchRepository getInstance(){
        return WikiSearchRepositoryImpl.getInstance();
    }

}
