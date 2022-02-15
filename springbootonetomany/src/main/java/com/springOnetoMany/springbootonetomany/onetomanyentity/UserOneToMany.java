package com.springOnetoMany.springbootonetomany.onetomanyentity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserOneToMany
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;

    @OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="UserId",referencedColumnName = "userId")
    private List<ComplaintOneToMany> complains;

}
