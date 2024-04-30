package com.example.modifier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util2 {
    public static String getCurrentDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(new Date());
    }
}
