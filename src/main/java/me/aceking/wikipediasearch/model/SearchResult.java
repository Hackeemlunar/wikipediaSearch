package me.aceking.wikipediasearch.model;

public class SearchResult {
    private String title;
    private String snippet;
    private String url;

    // Constructor
    public SearchResult(String title, String snippet, String url) {
        this.title = title;
        this.snippet = snippet;
        this.url = url;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "title='" + title + '\'' +
                ", snippet='" + snippet + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}