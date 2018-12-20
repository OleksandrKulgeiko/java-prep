package com.kulgeiko.java.basics;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by akulgeiko on 7/16/2018.
 */
public class DateTest {

    public static void main(String... args) {


        Date date1 = new Date();
        Date date2 = new GregorianCalendar(2018, Calendar.NOVEMBER, 15).getTime();

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.after(date2));

    }
}
