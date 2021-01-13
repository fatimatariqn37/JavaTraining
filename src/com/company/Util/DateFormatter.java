package com.company.Util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter {

    public void printDate(){

        Locale locale1 = new Locale("fr", "FR");


        Locale locale2 = new Locale("fr", "FR");

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale1);
        String date = dateFormat.format(new Date());
        System.out.print(date);


        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale2);
        String date2 = dateFormat.format(new Date());
        System.out.print(date2);


    }
}
