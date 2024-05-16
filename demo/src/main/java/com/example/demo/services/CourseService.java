package com.example.demo.services;

import com.example.demo.entities.Course;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(Long parseLong);
}
