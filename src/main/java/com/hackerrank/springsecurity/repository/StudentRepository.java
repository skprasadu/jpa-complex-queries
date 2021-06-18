package com.hackerrank.springsecurity.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackerrank.springsecurity.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	//@Query(nativeQuery = true, value="select scs.score desc FROM course c, student s, student_course_score scs where c.course_id=scs.course_id and s.student_id=scs.student_id and c.course_name=?1 order by scs.score desc limit 3;")
	//Set<Long> findTopThreeScorersInACourse(String course);
	
	//@Query(nativeQuery = true, value="select max(scs.score) FROM course c, student s, student_course_score scs where c.course_id=scs.course_id and s.student_id=scs.student_id group by c.course_name")
	//Set<Long> findHighestScoresInCourses();
}
