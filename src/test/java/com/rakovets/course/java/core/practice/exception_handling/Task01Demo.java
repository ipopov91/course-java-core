package com.rakovets.course.java.core.practice.exception_handling;

public class Task01Demo {
    public static void main(String[] args) {
        try {
            Task01.throwNullPointerException();
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        }
    }
}
