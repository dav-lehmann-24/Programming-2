package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        try (Scanner scanner = new Scanner(System.in)) {
       

            while (true) {
            System.out.println("\n=== Task Management System ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Perform All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task type (coding/documentation): ");
                    String type = scanner.nextLine();

                    Task task;
                    if (type.equalsIgnoreCase("coding")) {
                        System.out.print("Enter programming language: ");
                        String language = scanner.nextLine();
                        task = new CodingTask(title, language);
                    } else {
                        task = new DocumentationTask(title);
                    }

                    taskManager.addTask(task);
                    System.out.println("Task added!");
                    break;
                }
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    taskManager.performAllTasks();
                    break;
                case 4:
                    taskManager.viewTasks();
                    System.out.print("Enter task to delete:");
                    String taskToDelete = scanner.nextLine();
                    taskManager.deleteTask(taskToDelete);
                    break;
                case 5: {
                    System.out.println("Exiting...");
                    return;
                }
                default:
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
    }
}