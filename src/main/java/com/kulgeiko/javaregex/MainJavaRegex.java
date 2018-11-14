package com.kulgeiko.javaregex;

import javax.xml.XMLConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJavaRegex {

    public static void main(String... args){



        // String to be scanned to find the pattern.
        //String line = "This order was placed for QT3000! OK?";
        //String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        //Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        /*
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }*/

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");



        // boolean b = Pattern.matches("a*b", "aaaaab");
        boolean b = Pattern.matches(".*EF_WARR_A..*", "999999 EF_WARR_A.22Apr");
        System.out.println(b);









    }

}
