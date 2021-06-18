package com.hackerrank.springsecurity.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackerrank.springsecurity.dto.StudentCourseScore;

public interface StudentCourseScoreRepository extends JpaRepository<StudentCourseScore, Long> {
	//@Query(nativeQuery = true, value="select scs.score FROM course c, student s, student_course_score scs where c.course_id=scs.course_id and s.student_id=scs.student_id")
	//Set<Long> findHighestScoresInCourses();
}
