package com.example;

public class CodingTask extends Task {
    private String language;

    public CodingTask(String title, String language) {
        super(title);
        this.language = language;
    }

    @Override
    public void performTask() {
        System.out.println("Coding in " + language + " for task: " + title);
    }
}