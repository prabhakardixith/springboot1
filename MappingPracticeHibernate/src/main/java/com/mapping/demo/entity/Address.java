package com.mapping.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="AddressOneToOne")
public class Address
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer aId;
    private String street;
    private String fullAddress;

    @OneToOne(mappedBy ="address",cascade=CascadeType.ALL)
    @JsonIgnore
    private User user;

}
