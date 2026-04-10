package com.springrest.springrest.controller;

import com.springrest.springrest.Service.CourseService;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getcourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable long courseId){
        return courseService.getcourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.addcourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updatecourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable long courseId){
        courseService.deletecourse(courseId);
    }
}