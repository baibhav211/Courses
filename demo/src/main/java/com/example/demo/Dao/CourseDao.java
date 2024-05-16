package com.example.demo.Dao;

import com.example.demo.entities.Course;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
