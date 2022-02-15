package com.dailycodebuffer.springdatajpatutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course
{
    @Id
    @SequenceGenerator(name="Course_sequence",sequenceName = "Course_sequence",allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Course_sequence")
    private Long courseId;
    private String courseTitle;
    private Integer credits;

    @OneToOne(mappedBy="course")
    private CourseMaterial courseMaterial;
}
