package com.epam.training.SunnatillaSamatov.workingwithstrings.words;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        int counter = 0;
        if(words==null || sample ==null){
            counter=0;
        }else{
            for (String item:words) {
                if(item.trim().equalsIgnoreCase(sample.trim())){
                    counter+=1;
                }
            }
        }

        return counter;
    }

    public static String[] splitWords(String text) {
        if(text ==  null || text.equals("")){
            return null;
        }
        else{
            Pattern p = Pattern.compile("[ ,.:;?!]+");
            Matcher m = p.matcher(text);
            if(m.matches()){
                return null;
            }else {
                text=text.replaceAll("[,.:;?!]+", " ").trim();
                String[] split = text.split("[ ]+");
                return split;
            }

        }

    }

    public static String convertPath(String path, boolean toWin) {
        if(path==null || path.equals("")){
            return null;
        }else {
            if (!path.matches("^[C:]*[a-zA-Z_.\\d\\s\\\\]*$") && !path.matches("^[~]?[a-zA-Z_.\\d/\\s]*$")){
                return null;
            }

            if (toWin) {

                    path = path.replaceFirst("^~", "C:\\\\User");
                    path = path.replaceFirst("^/","C:\\\\");
                    path = path.replaceAll("/","\\\\");
                    return path;
            }

            else {
                    path = path.replaceFirst("^(C:\\\\User)","~");
                    path = path.replaceFirst("^(C:\\\\)","/");
                    path = path.replaceAll("\\\\","/");
                    return path;

            }
        }

    }

    public static String joinWords(String[] words) {
        if(words==null || words.length==0)  return null;
        else{
            StringBuilder sb = new StringBuilder("[");
            int emptyCounter=0;
            for (String word:words) {
                if(!word.equals("")){
                    sb.append(word).append(", ");
                }else emptyCounter++;
            }
            if(emptyCounter== words.length) return null;
            int leghth = sb.length();
            sb.delete(leghth-2,leghth).append("]");
            return sb.toString();
        }
    }






}