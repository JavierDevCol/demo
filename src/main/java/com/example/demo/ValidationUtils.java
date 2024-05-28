package com.example.demo;

public class ValidationUtils {
      public static boolean isNotNullOrEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
    public static boolean isPositive(int number) {
        return number > 0;
    }


    public static boolean isInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
