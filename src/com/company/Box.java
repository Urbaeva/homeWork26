package com.company;

public class Box <T>{
    public static <T> T boxMethod(T o){
        return o;
    }

    @Override
    public String toString() {
        return "Box{}";
    }
}