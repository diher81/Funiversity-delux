package be.dihertalem.funiversity.service;

import be.dihertalem.funiversity.domain.Course;
import be.dihertalem.funiversity.domain.Repository;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Named
public class CourseService {

    private Repository repo = new Repository();

    public Map<Integer, Course> getCourses(){
        try {
            return repo.getCourses();
        } catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("Empty array");
        }
    }

    public Course getCourse(int id){
        try {
            return repo.getCourse(id);
        } catch (IllegalArgumentException ex){
            return new Course("unknown", 0, "unknown", 0);
        }
    }

    public List<Course> getCoursesFromCategory(String category){
        try {
            return repo.getCoursesFromCategory(category);
        } catch (IllegalArgumentException ex){
            return new ArrayList<Course>();
        }
    }

    public List<Course> getCoursesWithProfessor(int professorId){
        try {
            return repo.getCoursesWithProfessor(professorId);
        } catch (IllegalArgumentException ex){
            return new ArrayList<Course>();
        }
    }

    public List<Course> getCoursesWithStudyPoints(int studyPoints){
        try {
            return repo.getCoursesWithStudyPoints(studyPoints);
        } catch (IllegalArgumentException ex){
            return new ArrayList<Course>();
        }
    }

    public void createCourse(String name, int studyPoints, String category, int professorId) {
        repo.addNewCourse(new Course(name, studyPoints, category, professorId));
    }

    public void deleteCourse(int courseId) {
        repo.deleteCourse(courseId);
    }

    public void updateCourseName(int id, String name) {
        repo.updateName(id, name);
    }

    public void updateCoursecategory(int id, String name) {
        repo.updateCategory(id, name);
    }

    public void updateStudyPoints(int id, int points) {
        repo.updateStudyPoints(id, points);
    }

    public void updateCourseProfessor(int courseId, int professorId) {
        repo.updateCourseProfessor(courseId, professorId);
    }
}
