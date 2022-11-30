package dev.metters;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("John", "Doe", 28));
//        System.out.println(new Car("Volvo", Year.of(2022)));
        System.out.println(new Car("Volvo", Year.of(2022), "Berlin"));
    }
}