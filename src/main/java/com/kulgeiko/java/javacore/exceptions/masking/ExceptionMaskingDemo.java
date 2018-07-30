package com.kulgeiko.java.javacore.exceptions.masking;

/**
 * Created by akulgeiko on 6/5/2018.
 */
public class ExceptionMaskingDemo {

    public static void main(String... args) throws Exception3{

        try{
            throw new Exception1();
        } catch (Exception1 e){
            throw new Exception2();
        }
            finally {
            throw new Exception3();
        }
    }

}
