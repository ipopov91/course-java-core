package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons favorite = Seasons.SUMMER;
        System.out.println(favorite + "\n");

        Seasons.getMessage(favorite);

        Seasons[] allSeasons = Seasons.values();
        for (Seasons season : allSeasons) {
            System.out.printf("%s: average temperature of the season: %s - %s\n",season, season.getAverageTemperature(), season.getDescription());
        }
    }
}
