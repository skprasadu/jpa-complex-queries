package com.hackerrank.springsecurity.service;

import java.util.Set;

//@Service
public interface CourseService {
	/*Set<String> getTopThreePopularCourses();
	
	Set<Long> getTopThreeScorersInACourse(String course);
	
	Set<Long> getHighestScoresInCourses();*/
	
	Set<Long> getAllStudentsCourseScore();
}
