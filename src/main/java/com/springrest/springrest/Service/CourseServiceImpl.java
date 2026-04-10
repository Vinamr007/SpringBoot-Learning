package com.springrest.springrest.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getcourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getcourse(long courseId) {
        return courseDao.findById(courseId).orElse(null);
    }

    @Override
    public Course addcourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updatecourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deletecourse(long courseId) {
        courseDao.deleteById(courseId);
    }
}