package com.workshop.recipesmanagement.Moldes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Recipe {

    @Id()
    @GeneratedValue
    private Integer id;


    @Column(
            name="recipe-name",
            nullable = false)
    private String name;


    @Enumerated(EnumType.STRING)
    @Column(name="category-name",
            nullable = false)
    private CategoryRecipe categoryRecipe;


    @ManyToOne
    @JoinColumn(name ="user-id")
    private User user;

    @ManyToMany
    @JoinTable(
            name="Recipe_ingrediants",
            joinColumns = @JoinColumn(name="recipe-id"),
            inverseJoinColumns = @JoinColumn(name="ingredient-id")
    )
    private List<Ingredient> ingredients;



}
