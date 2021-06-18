package com.hackerrank.springsecurity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
    private Long studentId;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(Long studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
