package com.workshop.recipesmanagement.Moldes;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Users")
public class User {


    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name="user_identifier",
            nullable = false,
            unique = true
    )
    private String identifier;

    @Column(
            name="user_firstname",
            nullable = false
    )
    private String firstname;

    @Column(
            name="user_lastname",
            nullable = false )
    private String lastname;

    @Column(
            name="user_email",
            nullable = false,
            unique = true
    )
    private String email;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name="role-name",
            nullable = false)
    private EmployeRole role;

    @OneToMany(mappedBy = "user")
    private List<Recipe>recipes;
}
