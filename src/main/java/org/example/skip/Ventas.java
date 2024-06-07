package org.example.skip;

import lombok.*;

import java.time.Month;

@ToString
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

public class Ventas {
    private Month month;
    private double total;
}
