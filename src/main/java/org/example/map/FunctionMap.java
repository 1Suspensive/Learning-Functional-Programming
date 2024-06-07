package org.example.map;

import java.util.List;

public class FunctionMap {
    public static void main(String[] args) {
        List<String> nombres = List.of("Jeferson","Andres","Estiven");
        nombres.stream()
                .map(n -> n.length())
                .forEach(System.out::println);

    }
}
