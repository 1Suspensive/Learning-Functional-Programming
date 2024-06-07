package org.example.filter;

import java.util.List;

public class FunctionFilter {
    public static void main(String[] args) {
        List<String> nombres = List.of("Jeferson","Sebastian","Simon");
        List<String> s = nombres.stream()
                .filter(n -> n.startsWith("S"))
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(s);

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero %2 ==0)
                .toList();

        List<Integer> impares = numeros.stream()
                        .filter(numero -> numero%2 != 0)
                        .toList();

        System.out.println(pares);
        System.out.println(impares);
    }
}
