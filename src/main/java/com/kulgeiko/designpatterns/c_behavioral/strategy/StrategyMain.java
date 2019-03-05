package com.kulgeiko.designpatterns.c_behavioral.strategy;

public class StrategyMain {

    public static void main(String... args){

        StrategyContext sc = new StrategyContext(new ZipArchivingStrategy());
        sc.archive("some file");

    }

}
