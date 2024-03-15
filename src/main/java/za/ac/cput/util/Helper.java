package za.ac.cput.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String a){
        if (a == null || a.isEmpty())
            return true;
        return false;
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

}
