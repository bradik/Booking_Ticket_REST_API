package com.booking.train.ticket.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Brad on 15.09.2017.
 */
public class DateFormater {
    public static final DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static Date of(String str) {
        Date retVal = null;
        try {
            retVal = formatter.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return retVal;
    }

    public static String of(Date date){
        return formatter.format(date);
    }
}
