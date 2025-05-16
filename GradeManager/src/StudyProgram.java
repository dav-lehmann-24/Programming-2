import java.util.List;
import java.util.ArrayList;

public class StudyProgram {
    private String name;
    private List<Courses> courses;

    public StudyProgram(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Courses course) {
        this.courses.add(course);
    }

    public void deleteCourse(Courses course) {
        this.courses.remove(course);
    }

    public List<Courses> getCourses() {
        return this.courses;
    }

    public String getName() {
        return this.name;
    }
}