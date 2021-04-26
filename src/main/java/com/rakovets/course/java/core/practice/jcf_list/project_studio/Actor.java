package com.rakovets.course.java.core.practice.jcf_list.project_studio;

public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (fee >= 0) {
            this.fee = fee;
        }
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public int compareTo(Actor o) {
        if (this.fee == o.getFee()) {
            return 0;
        } else if (this.fee > o.getFee()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Actor: " + firstName + " " + lastName + ", fee: " + fee + ", age: " + age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
