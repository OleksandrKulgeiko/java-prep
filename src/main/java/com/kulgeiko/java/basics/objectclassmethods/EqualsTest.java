package com.kulgeiko.java.basics.objectclassmethods;

import java.util.Objects;

public class EqualsTest {


    public static void main(String... args) {

        System.out.println(null == null);
        System.out.println(Objects.equals(null, null));

        Person p1 = new Person();
        p1.age = 1;
        p1.name = "Alex";

        Person p2 = new Person();
        p2.age = 1;
        p2.name = "Alex";

        System.out.println(Objects.equals(p1, p2));

    }


    static class Person {
        int age;
        String name;
        String surname;

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Person))
                return false;
            Person p = (Person)o;

            return p.age == age &&
                    p.name.equals(name) &&
                    Objects.equals(p.surname, surname);
        }
    }

}
