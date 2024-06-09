package org.example.utils;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class interfaceCollectors {
    public static void main(String[] args) {
        List<PersonWithBornAge> people = List.of(new PersonWithBornAge("Jeferson", "Ospina", LocalDate.parse("1999-09-19")),
                new PersonWithBornAge("Andres", "Bustamante", LocalDate.parse("2005-03-02")),
                new PersonWithBornAge("Santiago", "Garcia", LocalDate.parse("2005-04-02")));

        System.out.println(people.get(0).getBirthDate());

        Map<Integer, List<PersonWithBornAge>> result = people.stream()
                .collect(Collectors.groupingBy(PersonUtils::calculateAge));

        System.out.println(result);
    }
}
