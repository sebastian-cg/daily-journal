package com.example.dailyjournal;

public class JournalEntry {
    private String title;
    private String content;

    public JournalEntry(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}