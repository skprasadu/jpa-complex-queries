package com.hackerrank.springsecurity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentCourseScore {
	@Id
    private Long id;
    private Long studentId;
    private Long courseId;
    private Long score;

    public StudentCourseScore() {
    }

    public StudentCourseScore(Long id, Long studentId, Long courseId, Long score) {
    	this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }
}
