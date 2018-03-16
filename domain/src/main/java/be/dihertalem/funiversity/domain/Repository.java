package be.dihertalem.funiversity.domain;

import ch.qos.logback.core.joran.action.IncludeAction;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    private Map<Integer, Professor> professors;
    private Map<Integer, Course> courses;

    private Professor albert;
    private Professor stephen;
    private Professor tania;
    private Professor dirk;
    private Professor niels;
    private Professor gobelijn;
    private Professor barabas;

    private Course portuguese;
    private Course swimmmingWithDolphins;
    private Course biology;
    private Course pingpong;
    private Course physics;
    private Course blackHoles;
    private Course java;

    public Repository() {
        professors = new HashMap<Integer, Professor>();
        createProfessors();
        addProfessorsToDatabase();

        courses = new HashMap<Integer, Course>();
        createCourses();
        addCoursesToDatabase();
    }

    private void addProfessorsToDatabase() {
        professors.put(albert.getId(), albert);
        professors.put(stephen.getId(), stephen);
        professors.put(tania.getId(), tania);
        professors.put(dirk.getId(), dirk);
        professors.put(niels.getId(), niels);
        professors.put(gobelijn.getId(), gobelijn);
        professors.put(barabas.getId(), barabas);
    }

    private void addCoursesToDatabase() {
        courses.put(portuguese.getId(), portuguese);
        courses.put(swimmmingWithDolphins.getId(), swimmmingWithDolphins);
        courses.put(biology.getId(), biology);
        courses.put(pingpong.getId(), pingpong);
        courses.put(physics.getId(), physics);
        courses.put(blackHoles.getId(), blackHoles);
        courses.put(java.getId(), java);
    }

    private void createProfessors() {
        albert = new Professor("Albert", "Einstein");
        stephen = new Professor("Stephen", "Hawkins");
        tania = new Professor("Tania", "Lemos");
        dirk = new Professor("Dirk", "Hermans");
        niels = new Professor("Niels", "Delestinne");
        gobelijn = new Professor("Gobelijn", "Van Jommeke");
        barabas = new Professor("Barabas", "Van Suske en Wiske");
    }

    private void createCourses() {
        portuguese = new Course("POR", 5, "Language", tania.getId());
        swimmmingWithDolphins = new Course("DOL", 2, "sports", tania.getId());
        biology = new Course("BIO", 5, "science", dirk.getId());
        pingpong = new Course("PIN", 3, "sports", dirk.getId());
        physics = new Course("PHY", 4, "science", albert.getId());
        blackHoles = new Course("BLA", 4, "science", stephen.getId());
        java = new Course("JAV", 4, "IT", niels.getId());
    }

    public Map<Integer, Professor> getProfessors() {
        return professors;
    }

    public void deleteProfessor(int professorId) {
        professors.remove(professorId);
    }

    public void addNewProfessor(Professor professor) {
        professors.put(professor.getId(), professor);
    }

    public void updateFirstName(int professorId, String newFirstName) {
        Professor professor = professors.get(professorId);
        professor.setFirstName(newFirstName);
    }

    public void updateLastName(int professorId, String newLastName) {
        Professor professor = professors.get(professorId);
        professor.setLastName(newLastName);
    }

    public Professor getProfessor(int id) {
        return professors.get(id);
    }



    public Map<Integer, Course> getCourses() {
        return courses;
    }

    public void deleteCourse(int courseId) {
        courses.remove(courseId);
    }

    public void addNewCourse(Course course) {
        courses.put(course.getId(), course);
    }

    public void updateName(int courseId, String newName) {
        Course course = courses.get(courseId);
        course.setName(newName);
    }

    public void updateStudyPoints(int courseId, int newStudyPoints) {
        Course course = courses.get(courseId);
        course.setStudyPoints(newStudyPoints);
    }

    public void updateCategory(int courseId, String newCategory) {
        Course course = courses.get(courseId);
        course.setCategory(newCategory);
    }

    public void updateCourseProfessor(int courseId, int professorId) {
        Course course = courses.get(courseId);
        course.setProfessorId(professorId);
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }

    public List<Course> getCoursesFromCategory(String category) {
        ArrayList<Course> coursesFromCategory = new ArrayList<Course>();
        for (Course course : courses.values()) {
            if (course.getCategory().equals(category)) {
                coursesFromCategory.add(course);
            }
        }
        return coursesFromCategory;
    }

    public List<Course> getCoursesWithProfessor(int professorId) {
        ArrayList<Course> coursesWithProfessor = new ArrayList<Course>();
        for (Course course : courses.values()) {
            if (course.getCategory().equals(professorId)) {
                coursesWithProfessor.add(course);
            }
        }
        return coursesWithProfessor;
    }

    public List<Course> getCoursesWithStudyPoints(int studyPoints) {
        ArrayList<Course> coursesWithStudyPoints = new ArrayList<Course>();
        for (Course course : courses.values()) {
            if (course.getStudyPoints() == studyPoints) {
                coursesWithStudyPoints.add(course);
            }
        }
        return coursesWithStudyPoints;
    }
}
