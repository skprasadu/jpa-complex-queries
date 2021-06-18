package com.hackerrank.springsecurity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hackerrank.springsecurity.dto.Course;
import com.hackerrank.springsecurity.dto.Student;
import com.hackerrank.springsecurity.dto.StudentCourseScore;
import com.hackerrank.springsecurity.repository.CourseRepository;
import com.hackerrank.springsecurity.repository.StudentCourseScoreRepository;
import com.hackerrank.springsecurity.repository.StudentRepository;
import com.hackerrank.springsecurity.service.CourseService;

@SpringBootTest
class SpringJPATest {
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentCourseScoreRepository studentCourseScoreRepository;
	
	@Autowired
	private CourseService courseService;

    @BeforeEach
    public void seedData() {
    	courseRepository.save(new Course(1l, "dotnet", "Krishna", "24"));
    	courseRepository.save(new Course(2l, "java", "Aaron", "25"));
    	courseRepository.save(new Course(3l, "javascript", "Saran", "26"));
    	courseRepository.save(new Course(4l, "python", "Tom", "27"));
    	
    	studentRepository.save(new Student(1l, "Alex", "A"));
    	studentRepository.save(new Student(2l, "Jonathan", "R"));
    	studentRepository.save(new Student(3l, "David", "A"));
    	studentRepository.save(new Student(4l, "John", "G"));
    	studentRepository.save(new Student(5l, "Amir", "R"));
    	
    	studentCourseScoreRepository.save(new StudentCourseScore(1l, 1l, 1l, 40l));
    	studentCourseScoreRepository.save(new StudentCourseScore(2l, 1l, 2l, 41l));
    	studentCourseScoreRepository.save(new StudentCourseScore(3l, 2l, 3l, 42l));
        studentCourseScoreRepository.save(new StudentCourseScore(4l, 3l, 2l, 43l));
        studentCourseScoreRepository.save(new StudentCourseScore(5l, 4l, 2l, 45l));
        studentCourseScoreRepository.save(new StudentCourseScore(6l, 5l, 2l, 46l));
        studentCourseScoreRepository.save(new StudentCourseScore(7l, 2l, 2l, 47l));
    	studentCourseScoreRepository.save(new StudentCourseScore(8l, 5l, 3l, 48l));
    }
    
    @Test
    public void testAutowired() {
    	assertNotNull(courseRepository);
    	assertNotNull(studentRepository);
    	assertNotNull(studentCourseScoreRepository);
    	assertNotNull(courseService);
    }

    /*@Test
    public void testGetTopThreePopularCourses() {
    	Set<String> set = courseService.getTopThreePopularCourses();
    	
    	assertTrue(set.contains("java"));
    	assertTrue(set.contains("dotnet"));
    	assertTrue(set.contains("javascript"));
    	
    	assertFalse(set.contains("python"));
    }
    @Test
    public void testGetTopThreeScorersInACourse() {
    	Set<Long> set = courseService.getTopThreeScorersInACourse("java");
    	
    	assertTrue(set.contains(47l));
    	assertTrue(set.contains(46l));
    	assertTrue(set.contains(45l));
    	
    	assertFalse(set.contains(48l));
    }
    @Test
    public void testGetHighestScoresInCourses() {
    	Set<Long> set = courseService.getHighestScoresInCourses();
    	
    	assertTrue(set.contains(40l));
    	assertTrue(set.contains(47l));
    	assertTrue(set.contains(48l));
    	
    	assertFalse(set.contains(46l));
    	
    }*/
    
    @Test
    public void testGetAllStudentsCourseScore() {
    	Set<Long> set = courseService.getAllStudentsCourseScore();
    	
    	assertTrue(set.contains(40l));
    	assertTrue(set.contains(45l));    	
    }
}
