public class Courses {

    private String name;
    private int credits;
    private int semester;

    public Courses(String name, int credits, int semester) {
        this.name = name;
        this.credits = credits;
        this.semester = semester;
    }

    public String getName() {
        return this.name;
    }

    public int getCredits() {
        return this.credits;
    }

    public int getSemester() {
        return this.semester;
    }
}