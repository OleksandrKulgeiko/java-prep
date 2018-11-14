package com.kulgeiko.java.basics.strings;



public class StringTest {

    public static void main(String args[]) {

        String xml = "eeeee <Agreement></Agreement>asdasd";
        String putNamespaceAfter = "<Agreement";

        int i = xml.indexOf(putNamespaceAfter);
        System.out.println(i);
        String updated = new StringBuilder(xml).insert(i + putNamespaceAfter.length()," csa ").toString();

        System.out.println(updated);


    }
}
