package com.kulgeiko.java.basics;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesMain {
    public static void main(String... args) throws Exception {

        Files.write(Paths.get("D:\\0_My_coding\\2_My_Github_projects\\java-prep\\444\\my.txt"), "rr".getBytes(StandardCharsets.UTF_8));
    }

}
