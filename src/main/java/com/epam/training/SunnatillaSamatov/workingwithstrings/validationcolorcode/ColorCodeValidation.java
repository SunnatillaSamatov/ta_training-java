package com.epam.training.SunnatillaSamatov.workingwithstrings.validationcolorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {

        if(color==null){
            return false;
        }
        else{
            Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
            Matcher m = pattern.matcher(color);
            if(m.matches()){
                return true;
            }else{
                return false;
            }
        }

    }
}





