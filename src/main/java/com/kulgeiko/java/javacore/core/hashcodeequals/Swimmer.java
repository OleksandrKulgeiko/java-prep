package com.kulgeiko.java.javacore.core.hashcodeequals;

/**
 * Created by akulgeiko on 6/8/2018.
 */
public class Swimmer {

    int id;
    String name;
    int age;

    public Swimmer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Swimmer(int id){
        this.id = id;
    }
/*
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof Swimmer))
            return false;
        if (obj == this)
            return true;
        return this.id == ((Swimmer)obj).id;
    }
*/
    @Override
    public int hashCode(){
        return 1;
    }


}
