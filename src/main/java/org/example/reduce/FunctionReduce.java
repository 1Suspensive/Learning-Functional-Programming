package org.example.reduce;

import java.util.*;

public class FunctionReduce {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        OptionalInt resultSum = Arrays.stream(array)
                .reduce(Integer::sum); //<-- Tambien es conocido como sum

        System.out.println(resultSum.orElseThrow());

        OptionalInt resultFactorial = Arrays.stream(array)
                .reduce((a,b) -> a*b);

        System.out.println(resultFactorial.orElseThrow());

        OptionalInt maxElement = Arrays.stream(array)
                .reduce(Integer::max);

        System.out.println(maxElement.orElseThrow());

        String[] cadena = {"hola","mundo","java"};

        Optional<String> stringConcanated = Arrays.stream(cadena)
                .reduce((str1, str2) -> str1 + "-" + str2);

        System.out.println(stringConcanated.orElseThrow());

        //Advanced reduce

        List<String> nombres = List.of("Jeferson","Amelia","Andres","Yeison");
        String reduccionCadena = nombres.stream()
                .reduce("", (str1, str2) -> str1 + "-" + str2);

        System.out.println(reduccionCadena);

        ArrayList<Object> listUsingAdavancedReduction = nombres.stream()
                .filter(name -> name.startsWith("A"))
                .reduce(new ArrayList<>(),
                        (lista, elemento) -> {
                            lista.add(elemento);
                            return lista;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }
                );
        System.out.println(listUsingAdavancedReduction);

    }
}
