package com.cognizant.spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String hello() {
        return "Hello, Atreyee!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/greet/{name}")
    public String greetPath(@PathVariable String name) {
        return "Hello from path, " + name + "!";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return "Course added: " + course.getName();
    }

    @PutMapping("/courses/{id}")
    public String updateCourse(@PathVariable String id, @RequestBody Course course) {
        boolean updated = courseService.updateCourse(id, course);
        return updated ? "Course updated: " + id : "Course with ID " + id + " not found.";
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourse(@PathVariable String id) {
        boolean removed = courseService.deleteCourse(id);
        return removed ? "Course with ID " + id + " deleted." : "Course with ID " + id + " not found.";
    }
}
