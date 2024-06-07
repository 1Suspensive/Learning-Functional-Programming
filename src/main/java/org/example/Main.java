package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> friends = List.of("Jeferson","Jorge","Andres");
        List<String> enemies = List.of("Andres","Sara","Valeria");

        Predicate<String> predicator = name -> name.startsWith("A");

        Function<String,Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);


        List<String> friendsStartsWithA = friends.stream()
                .filter(predicator)
                .toList();

        List<String> enemiesStartsWithS = enemies.stream()
                        .filter(startsWithLetter.apply("S"))
                        .toList();

        System.out.println(enemiesStartsWithS);
        System.out.println(friendsStartsWithA);
    }
}