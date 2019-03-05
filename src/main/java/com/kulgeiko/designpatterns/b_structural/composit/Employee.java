package com.kulgeiko.designpatterns.b_structural.composit;



public interface Employee {

    void add(Employee employee);
    void remove(Employee employee);
    Employee getChild(int i);
    String getName();
    double getSalary();
    void print();
}
