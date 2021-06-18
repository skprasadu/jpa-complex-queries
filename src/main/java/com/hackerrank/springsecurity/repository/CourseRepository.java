package com.hackerrank.springsecurity.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackerrank.springsecurity.dto.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	//@Query(nativeQuery = true, value="SELECT c.course_name FROM course c, student s, student_course_score scs where c.course_id=scs.course_id and s.student_id=scs.student_id group by c.course_name order by count(s.first_name) desc limit 3")
	//public 	Set<String> findTopThreePopularCourses();

}
