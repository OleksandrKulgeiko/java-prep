package com.kulgeiko.designpatterns.b_structural.filter.criteria;

import com.kulgeiko.designpatterns.b_structural.filter.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}