package za.ac.cput.util;

import java.util.Date;
import java.util.UUID;

/*
Helper.java
Helper class
Author: Natheer Shade 217159109 https://github.com/natheerShade13
Date: 13/03/2024
 */
public class Helper {

    public static boolean isNullOrEmpty(String a){
        if (a == null || a.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Date date){
        if (date == null)
            return true;
        return false;
    }

    public static boolean isNegative(int b){
        if(b < 0)
            return true;
        return false;
    }

    public static boolean isNegative(double a){
        if(a < 0)
            return true;
        return false;
    }


    public static String generateID(){
        return UUID.randomUUID().toString();
    }
}
