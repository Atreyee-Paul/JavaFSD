package com.cognizant.spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public boolean deleteCourse(String id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean updateCourse(String id, Course updatedCourse) {
        if (courseRepository.existsById(id)) {
            updatedCourse.setId(id);
            courseRepository.save(updatedCourse);
            return true;
        }
        return false;
    }
}
