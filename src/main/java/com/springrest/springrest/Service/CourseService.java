package com.springrest.springrest.Service;

import com.springrest.springrest.entities.Course;
import java.util.List;

public interface CourseService {

    List<Course> getcourse();

    Course getcourse(long courseId);

    Course addcourse(Course course);

    Course updatecourse(Course course);

    void deletecourse(long courseId);
}