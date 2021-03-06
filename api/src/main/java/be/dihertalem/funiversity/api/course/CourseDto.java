package be.dihertalem.funiversity.api.course;

public class CourseDto {

    private int id;
    private String name;
    private int studyPoints;
    private String category;
    private int professorId;

    public CourseDto(int id, String name, int studyPoints, String category, int professorId) {
        this.id = id;
        this.name = name;
        this.studyPoints = studyPoints;
        this.category = category;
        this.professorId = professorId;
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
}
