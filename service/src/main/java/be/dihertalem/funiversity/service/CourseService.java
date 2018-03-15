package be.dihertalem.funiversity.service;

import be.dihertalem.funiversity.domain.Course;
import be.dihertalem.funiversity.domain.Repository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class CourseService {

    Repository repo = new Repository();

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
}
