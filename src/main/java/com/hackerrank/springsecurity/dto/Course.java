package com.hackerrank.springsecurity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {
	@Id
    private Long courseId;
    private String courseName;
    private String nameOfInstructor;
    private String roomNumber;

    public Course() {
    }

    public Course(Long courseId, String courseName, String nameOfInstructor, String roomNumber) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.nameOfInstructor = nameOfInstructor;
        this.roomNumber = roomNumber;
    }
}
