package com.kulgeiko.helptodima;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private Address address;

    Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address =address;
    }

    Address getAddress() {
        return address;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }


}

class Address {
    private String address;
    Address (String address){
        this.address = address;

    }

    public String getAddress() {
        return address;
    }
}

public class Part1 {

    public static void main(String [] args) {
        List<Person> persons = Arrays.asList(
                new Person("A", 15, new Address("Montreal")),
                new Person("B", 24, new Address("Sherbrooke")),
                new Person("C", 62, new Address("Montreal")),
                new Person("D", 8, new Address("Montreal")),
                new Person("E", 90, new Address("Quebec")),
                new Person("F", 34, new Address("Granby")),
                new Person("G", 21, new Address("Montreal"))
        );

        printStatus(persons);

        Map<String, Long> cs = getCityStats(persons);
        assert cs != null;
        for (Map.Entry<String, Long> entry : cs.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void printStatus(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getAge));
        for(Person p : persons) {
            System.out.println(p.getName() + " is"
                            + (p.getAge()<=21 ? " young" : " not that young")
                            + " [" + p.getAge() + "]");
        }
    }

    private static Map<String, Long> getCityStats(List<Person> persons){
        Map<String, Long> counts =
                persons.stream().collect(Collectors.groupingBy(person -> person.getAddress().getAddress(), Collectors.counting()));
        return counts;
    }
}