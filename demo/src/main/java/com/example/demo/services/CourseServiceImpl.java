package com.example.demo.services;

import com.example.demo.Dao.CourseDao;
import com.example.demo.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;



//    List<Course> list;
//    public CourseServiceImpl()
//    {
//        list=new ArrayList<>();
//        list.add(new Course(145,"Java","This is Java"));
//        list.add(new Course(146,"C++","This is C++"));
//        list.add(new Course(147,"Python","This is Python"));
//    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

//        Course c=null;
//        for (Course course:list) {
//            if(course.getId()==courseId)
//            {
//                c=course;
//                break;
//            }
//
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long parseLong) {
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity=courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }
}
