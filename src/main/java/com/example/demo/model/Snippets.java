package com.example.demo.model;

public class Snippets {

    private Long Id;

    private String Language;
    private String Snippet;

    public Snippets(Long id, String language, String snippet) {
        Id = id;
        Language = language;
        Snippet = snippet;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getSnippet() {
        return Snippet;
    }

    public void setSnippet(String snippet) {
        Snippet = snippet;
    }
}
