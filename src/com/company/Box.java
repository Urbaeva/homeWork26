package com.company;

public class Box <T>{
    private  T field;

    public Box(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public static <T> T boxMethod(T o){
        return o;
    }

    @Override
    public String toString() {
        return "Box{" +
                "field=" + field +
                '}';
    }
}