package com.epam.training.SunnatillaSamatov.exceptions.requirements;

public class Requirements {

    public static void requireNonNull(Object obj) {
        if(obj ==null){
            throw new NullPointerException();
        }
    }

    public static void requireNonNull(Object obj, String message) {
        if(obj ==null ){
            throw new NullPointerException(message);
        }
    }

    public static void checkArgument(boolean value) throws IllegalAccessException {
        if(value==false){
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean value, String message) throws IllegalAccessException {
        if(value==false){
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkState(boolean value) {
        if(!value){
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean value, String message) {
        if(value==false){
            throw new IllegalStateException(message);
        }
    }

    public static void checkIndex(int index, int size) {
        if(index>=size || index<0){
            throw new IndexOutOfBoundsException();
        }
    }


}