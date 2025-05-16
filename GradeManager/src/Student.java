import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int studentID;
    private StudyProgram studyProgram;
    private Map<Courses, Double> grades;

    public Student(String name, int studentID, StudyProgram studyProgram) {
        this.name = name;
        this.studentID = studentID;
        this.studyProgram = studyProgram;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void addToCourses(Courses course) {
        if (studyProgram.getCourses().contains(course)) {
            if(!grades.containsKey(course)) {
                grades.put(course, null);
                System.out.println("Added " + course.getName() + " to " + this.name);
            }
            else {
                System.out.println("Course " + course.getName() + " already added to " + this.name);
            }
        }
        else {
            System.out.println("Course " + course.getName() + " not in study program " + this.studyProgram.getName());
        }
    }

    public void addGrade(Courses course, double grade) {
        if (grades.containsKey(course)) {
            grades.put(course, grade);
            System.out.println("Added grade " + grade + " to " + course.getName() + " for " + this.name);
        }
        else {
            System.out.println("Student " + this.name + " is not assigned for " + course.getName());
        }
    }

    public double getAverageGrade() {
        double sum = 0;
        int count = 0;

        for (Double grade : grades.values()) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }

        return count == 0 ? 0.0 : sum / count;
    }

    public double getGPA() {
        int totalCredits = 0;

        return 0;
    }
}