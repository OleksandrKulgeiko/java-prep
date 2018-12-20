package com.kulgeiko.java.multithreading.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

public class MyRecursiveAction extends RecursiveAction {

    private String textToUpperCase = "";
    private static final int THRESHOLD = 4;


    public MyRecursiveAction(String textToUpperCase) {
        this.textToUpperCase = textToUpperCase;
    }

    @Override
    protected void compute() {
        if (textToUpperCase.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubtasks());
        } else {
            processing(textToUpperCase);
        }
    }

    private List<MyRecursiveAction> createSubtasks() {
        List<MyRecursiveAction> subtasks = new ArrayList<>();

        String partOne = textToUpperCase.substring(0, textToUpperCase.length() / 2);
        String partTwo = textToUpperCase.substring(textToUpperCase.length() / 2, textToUpperCase.length());

        subtasks.add(new MyRecursiveAction(partOne));
        subtasks.add(new MyRecursiveAction(partTwo));

        return subtasks;
    }

    private void processing(String text) {
        System.out.println("This [" + text.toUpperCase() + "] - was processed by " + Thread.currentThread().getName());
    }
}