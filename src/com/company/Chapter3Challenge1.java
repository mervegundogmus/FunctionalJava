package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter3Challenge1 {

    static class Person {

        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {

        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }
    }

    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float price;

        public Employee(String name, Integer age, String jobTitle, Float price) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Merve", 27),
                new Person("Ahmet", 28),
                new Person("Veronica", 56),
                new Person("Jenna", 33)
        };

        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        // Answer 1 goes here

        List<String> peopleNames = people
                .stream()
                .map((person) -> person.name)
                .collect(Collectors.toList());

        System.out.println(peopleNames);

        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 160000f),
                new Car("Renault", "blue", 150000f),
        };

        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Answer 2 goes here

        List<Car> blueCars = cars
                .stream()
                .filter((car) -> car.color == "blue")
                .collect(Collectors.toList());

        System.out.println(blueCars);


    }

}
