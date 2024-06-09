package org.example.utils;

import org.example.reduce.Person;

import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Function;

public class interfaceComparator {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Jeferson", "Ospina", 19),
                new Person("Andres", "Bustamante", 2),
                new Person("Santiago", "Garcia", 19));
        Function<Person, Integer> byAge = Person::getAge;
        Function<Person, String> byName = Person::getName;

        List<Person> result = people.stream()
               .sorted(comparing(byAge).thenComparing(byName))
               .toList();

        System.out.println(result);
    }
}
