package com.example.minitest.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCity;

    @NotEmpty
    private String nameCity;


    private double population;

    private double GDP;

    @NotEmpty
    private String description;

    @ManyToOne
    private Country country;

}
