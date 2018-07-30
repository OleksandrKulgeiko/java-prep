package com.kulgeiko.java.java8.e_streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by akulgeiko on 7/5/2018.
 */
public class AnotherStreamExample {

    public static void main(String... args){

        User user1 = new User(25,"Ashly");
        User user2 = new User(30,"John");
        User user3 = new User(40,"Alf");
        User user4 = new User(41,"Joe");

        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);

        Long userNum;

        userNum = listOfUsers.stream()
                .filter((user)->(user.age >= 40))
                .collect(Collectors.counting());

        System.out.println(userNum);

    }


}


class User {
    int age;
    String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }
}
