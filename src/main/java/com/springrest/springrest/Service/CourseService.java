package com.springrest.springrest.Service;

import com.springrest.springrest.entities.course;
import java.util.List;

// This is an INTERFACE
// It only defines WHAT operations we can do (not HOW)
public interface CourseService {

    // Get all courses
    List<course> getcourse();

    // Get single course by ID
    course getcourse(long courseId);

    // Add new course
    public course addcourse(course course);

    // Update existing course
    public course updatecourse(course course);

    // Delete course by ID
    public void deletecourse(long courseId);
}