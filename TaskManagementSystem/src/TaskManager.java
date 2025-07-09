package com.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();


    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
            }
        }
        return tasks;
    }

    public void performAllTasks() {
        for (Task task : tasks) {
            task.performTask();
        }
    }

    public void deleteTask(String taskToDelete) {

        for(Task task : tasks){
            String title = task.getTitle();
            if (title.equals(taskToDelete)) {
                tasks.remove(task);

            }
        }


    }
}