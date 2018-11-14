package com.kulgeiko.drools.model;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Applicant {

    private Country country;
    private String name;
    private int age;
    private double currentSalary;
    private int experienceInYears;

    public Applicant(String name, int age, Double currentSalary, int experienceInYears, Country country) {
        this.name = name;
        this.age = age;
        this.currentSalary = currentSalary;
        this.experienceInYears = experienceInYears;
        this.country = country;
    }

}
