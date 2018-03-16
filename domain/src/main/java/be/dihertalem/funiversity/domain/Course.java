package be.dihertalem.funiversity.domain;

public class Course {

    private int id;
    private String name;
    private int studyPoints;
    private String category;
    private int professorId;
    private static int numberOfCourses;

    public Course(String name, int studyPoints, String category, int professorId) {
        this.id = numberOfCourses;
        this.name = name;
        this.studyPoints = studyPoints;
        this.category = category;
        this.professorId = professorId;
        numberOfCourses++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public String getCategory() {
        return category;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
}
