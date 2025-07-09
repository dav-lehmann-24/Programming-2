package com.example;

public abstract class Task {
    protected String title;

    public Task(String title) {
        this.title = title;
    }

    public abstract void performTask();

    public String getTitle() {
        return title;
    }
}