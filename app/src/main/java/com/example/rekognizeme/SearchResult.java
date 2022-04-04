package com.example.rekognizeme;

public class SearchResult {

    private String title, link, snippet, display_link;

    public SearchResult(String title, String link, String snippet, String display_link) {
        this.title = title;
        this.link = link;
        this.snippet = snippet;
        this.display_link = display_link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getDisplay_link() {
        return display_link;
    }

    public void setDisplay_link(String display_link) {
        this.display_link = display_link;
    }


}
