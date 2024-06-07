package org.example.skip;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FunctionSkip {
    public static void main(String[] args) {
        final List<Ventas> ventasAnuales = Arrays.stream(Month.values())
                .map(month -> new Ventas(month,obtenerDoubleAleatorio()))
                .toList();

        int valueToSkip = 6;

        List<Ventas> halfYear = ventasAnuales.stream()
                .skip(valueToSkip)
                .toList();
        System.out.println(halfYear);

        System.out.println(ventasAnuales);
    }

    private static double obtenerDoubleAleatorio(){
        return new Random().nextDouble(2000);
    }
}
