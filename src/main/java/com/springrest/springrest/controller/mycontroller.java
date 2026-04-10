package com.springrest.springrest.controller;

import com.springrest.springrest.Service.CourseService;
import com.springrest.springrest.entities.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController → tells Spring this class handles API requests
@RestController
public class mycontroller {

    // Inject service layer
    @Autowired
    private CourseService courseService;

    // Simple test API
    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }

    // GET ALL COURSES
    @GetMapping("/courses")
    public List<course> getcourse(){
        return this.courseService.getcourse();
    }

    // GET SINGLE COURSE
    @GetMapping("/course/{courseId}")
    public course getCourse(@PathVariable String courseId){

        // Convert String → long
        return this.courseService.getcourse(Long.parseLong(courseId));
    }

    // ADD COURSE (POST)
    @PostMapping("/course")
    public course addcourse(@RequestBody course course){

        // @RequestBody → takes JSON input
        return this.courseService.addcourse(course);
    }

    // UPDATE COURSE (PUT)
    @PutMapping("/course")
    public course updateCourse(@RequestBody course course){

        return this.courseService.updatecourse(course);
    }

    // DELETE COURSE
    @DeleteMapping("/course/{courseId}")
    public void deleteCourse(@PathVariable String courseId){

        this.courseService.deletecourse(Long.parseLong(courseId));
    }
}