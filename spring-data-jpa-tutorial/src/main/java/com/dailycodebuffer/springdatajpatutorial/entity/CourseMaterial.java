package com.dailycodebuffer.springdatajpatutorial.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(name="courseMaterial_sequence",sequenceName="courseMaterial_sequence",allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="courseMaterial_sequence")
    private Long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="course_Id",referencedColumnName ="courseId")
    private Course course;
}
