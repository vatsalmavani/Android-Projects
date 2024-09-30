package com.example.contactlist;

public class Person {
    int image;
    String name;
    String number;

    Person(int image, String name, String number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }

    int getImage() { return image; }

    String getName() { return name; }

    String getNumber() { return number; }
}