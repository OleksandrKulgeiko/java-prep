package com.kulgeiko.designpatterns.c_behavioral.strategy;

public class RarArchivingStrategy implements ArchivingStrategy{

    @Override
    public void archive(String pathToFile) {
        System.out.println("RAR archiver");
    }
}