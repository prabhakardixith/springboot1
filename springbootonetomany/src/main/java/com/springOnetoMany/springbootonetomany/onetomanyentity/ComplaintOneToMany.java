package com.springOnetoMany.springbootonetomany.onetomanyentity;

import com.springOnetoMany.springbootonetomany.entity.User;
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
public class ComplaintOneToMany
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String complaintName;

    private String description;


}
