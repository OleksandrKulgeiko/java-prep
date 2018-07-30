package com.kulgeiko.java.basics.objectclassmethods;

import com.kulgeiko.java.Engine;

/**
 * Created by akulgeiko on 7/16/2018.
 */
public class CloneTest implements Cloneable{
    String name;
    int age;
    Engine engine;

    public static void main(String... args) throws Exception{

        Engine engine = new Engine();
        engine.capacity = 1.6;

        CloneTest cloneTest1 = new CloneTest(32, "Alex", engine);
        CloneTest cloneTest2 = (CloneTest)cloneTest1.clone();
        System.out.println("Before modification - " + cloneTest1 + "; " + cloneTest2);

        cloneTest2.age = 18;
        cloneTest2.name = "Ross";
        cloneTest2.engine.capacity = 4.5;

        System.out.println("After modification - " + cloneTest1 + "; " + cloneTest2);
    }

    public CloneTest(int age, String name, Engine engine) {
        this.age = age; this.name = name; this.engine = engine;
    }

    public String toString(){
        return this.name + "-" + this.age + "-" + this.engine.capacity;
    }


}
