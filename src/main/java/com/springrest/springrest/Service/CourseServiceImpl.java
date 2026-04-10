package com.springrest.springrest.Service;

import com.springrest.springrest.entities.course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// @Service tells Spring this class contains business logic
@Service
public class CourseServiceImpl implements CourseService {

    // This list works like a temporary database
    private final List<course> list;

    // Constructor runs when application starts
    public CourseServiceImpl(){

        // Create empty list
        list = new ArrayList<>();

        // Add some default data
        list.add(new course(145,"Java Core Course","This course contains basic of java"));
        list.add(new course(146,"Spring Boot Course","Creating rest api using spring boot"));
    }

    // GET ALL COURSES
    @Override
    public List<course> getcourse() {
        return list; // return full list
    }

    // GET SINGLE COURSE BY ID
    @Override
    public course getcourse(long courseId) {

        course c = null;

        // Loop through list
        for (course currentCourse : list) {

            // Check if ID matches
            if (currentCourse.getId() == courseId) {
                c = currentCourse; // store found course
                break; // stop loop
            }
        }

        return c; // return found course
    }

    // ADD NEW COURSE (POST)
    @Override
    public course addcourse(course course) {

        list.add(course); // add course to list
        return course;    // return added course
    }

    // UPDATE COURSE (PUT)
    @Override
    public course updatecourse(course course) {

        // Loop through list
        list.forEach(e -> {

            // If ID matches → update values
            if (e.getId() == course.getId()) {

                e.setTittle(course.getTittle());
                e.setDescription(course.getDescription());
            }
        });

        return course; // return updated course
    }

    // DELETE COURSE
    @Override
    public void deletecourse(long courseId) {

        // removeIf → removes element if condition is true
        list.removeIf(e -> e.getId() == courseId);
    }
}