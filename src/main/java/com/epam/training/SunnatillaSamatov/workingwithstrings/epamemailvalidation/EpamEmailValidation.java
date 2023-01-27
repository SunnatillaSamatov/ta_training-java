package com.epam.training.SunnatillaSamatov.workingwithstrings.epamemailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if(email==null) return false;
        else {
            Pattern p = Pattern.compile("([A-Za-z0-9]{1,})_([A-Za-z0-9]{1,})(@epam.com)");
            Matcher m = p.matcher(email);
            boolean output = false;
            while (m.find()) {
                output = true;
            }
            return output;
        }
    }
}





