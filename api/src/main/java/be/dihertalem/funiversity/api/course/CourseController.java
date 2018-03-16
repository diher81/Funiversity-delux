package be.dihertalem.funiversity.api.course;

import be.dihertalem.funiversity.api.professor.ProfessorDto;
import be.dihertalem.funiversity.api.professor.ProfessorMapper;
import be.dihertalem.funiversity.domain.Course;
import be.dihertalem.funiversity.domain.Professor;
import be.dihertalem.funiversity.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {

    private CourseService service;

    @Inject
    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getCourses(){
        List<CourseDto> courseDtos = new ArrayList<CourseDto>();
        for(Course course : service.getCourses().values()) {
            courseDtos.add(CourseMapper.courseMapper(course));
        }
        return courseDtos;
    }
}
