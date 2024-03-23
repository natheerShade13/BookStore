package za.ac.cput.util;

import java.util.UUID;

/*

Author: Natheer Shade 217159109 13/03/2024

 */
public class Helper {

    public static boolean isNullOrEmpty(String a){
        if (a == null || a.isEmpty())
            return true;
        return false;
    }

    public static boolean isNegative(int b){
        if(b < 0)
            return true;
        return false;
    }

    public static boolean isNegative(double c){
        if(c < 0)
            return true;
        return false;
    }


    public static String generateID(){
        return UUID.randomUUID().toString();
    }

}
