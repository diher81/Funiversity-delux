package be.dihertalem.funiversity.api.course;

import be.dihertalem.funiversity.domain.Course;

public class CourseMapper {

    public static CourseDto courseMapper(Course course) {
        return new CourseDto(course.getId(), course.getName(), course.getStudyPoints(),
                course.getCategory(), course.getProfessorId());
    }
}
