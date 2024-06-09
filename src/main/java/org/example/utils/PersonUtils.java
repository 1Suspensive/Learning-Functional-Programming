package org.example.utils;

import java.time.LocalDate;
import java.time.Period;

public class PersonUtils {
    public static int calculateAge(PersonWithBornAge person){
        return Period.between(person.getBirthDate(), LocalDate.now()).getYears();
    }
}
