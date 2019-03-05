package com.kulgeiko.designpatterns.c_behavioral.memento;

public class MementoDemo {
    public static void main(String... args) {
        EditorOriginator editor = new EditorOriginator();
        editor.setContent("This is my first article");
        System.out.println(editor.content); // This is my first article

        // Saving current state
        EditorMemento savePoint1 = editor.save();

        editor.setContent("Ha-ha-ha, this is new string, which I realized I do not need");
        System.out.println(editor.content); // Ha-ha-ha, this is new string, which I realized I do not need

        // Rolling back to previous state
        editor.restoreToState(savePoint1);
        System.out.println(editor.content); // This is my first article
    }
}