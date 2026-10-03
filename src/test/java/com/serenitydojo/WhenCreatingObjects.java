package com.serenitydojo;

import org.junit.jupiter.api.Test;

public class WhenCreatingObjects {

    @Test
    public void creatingCat() {

        String name = "Felix";
        String favoriteFood = "Tune";
        int age = 4;

        Cat felix = new Cat("Felix", "Tune", 4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());
        System.out.println(spot.getAge());
    }
}
