package com.kulgeiko.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {

    private String name;

    public Country(String name) {
        this.name = name;
    }
}
