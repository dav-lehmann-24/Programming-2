package com.example;

public class DocumentationTask extends Task {

    public DocumentationTask(String title) {
        super(title);
    }

    @Override
    public void performTask() {
        System.out.println("Writing docs for: " + title);
    }
}