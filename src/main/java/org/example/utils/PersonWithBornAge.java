package org.example.utils;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class PersonWithBornAge {
    private String name;
    private String lastName;
    private LocalDate birthDate;
}
