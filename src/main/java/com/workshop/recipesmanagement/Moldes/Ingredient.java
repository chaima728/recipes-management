package com.workshop.recipesmanagement.Moldes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name="ingredient-name",
            nullable = false,
            unique = true)
    private String name;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;




}
