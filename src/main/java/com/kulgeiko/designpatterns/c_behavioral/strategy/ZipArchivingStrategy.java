package com.kulgeiko.designpatterns.c_behavioral.strategy;

public class ZipArchivingStrategy implements ArchivingStrategy{

    @Override
    public void archive(String pathToFile) {
        System.out.println("ZIP archiver");
    }
}
