package java8;

import java.util.Locale;

public class CapitalFirstLetterMethodRef {
    public static void main(String[] args) {
        MyInterface6 m = CapitalFirstLetterMethodRef::firstlettercaps;
        System.out.println(m.capital("maharashtra"));

    }

    private static String firstlettercaps(String str) {
        return str.replaceFirst(str.substring(0,1),new String(String.valueOf(str.charAt(0))).toUpperCase());
    }
}

interface MyInterface6{
    String capital(String str);
}