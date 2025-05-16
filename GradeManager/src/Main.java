import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudyProgram studyProgram = null;
        Student student = null;

        while (true) {
            System.out.println("======= STUDY PROGRAM MANAGER =======");
            System.out.println("1. Add Study Program");
            System.out.println("2. Add course to study program");
            System.out.println("3. Add student");
            System.out.println("4. Assign student to course");
            System.out.println("5. Show all courses");
            System.out.println("6. Show assigned courses of a student");
            System.out.println("7. Add grade for a course");
            System.out.println("0. Exit");
            System.out.print("Please enter a number: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}