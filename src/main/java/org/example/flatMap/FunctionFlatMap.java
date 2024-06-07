package org.example.flatMap;

import java.util.Arrays;

public class FunctionFlatMap {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(arr));

        int arrPlano[] = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(arrPlano));

    }
}
