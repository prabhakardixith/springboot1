package com.beanvalidation.demo.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="User_Bean_Validation")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NonNull
    @NotEmpty
    @Size(min=2, message = "name should be atlease 2 character")
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    @Email(message = "value should be email")
    @NotEmpty
    private String email;

//    @Size(min=10,message = "should 10 numbers")
    @NonNull
    private Long mobile;
}
