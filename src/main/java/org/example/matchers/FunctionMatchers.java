package org.example.matchers;

import java.util.Arrays;

public class FunctionMatchers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] evenArr = {2,4,6,8};
        int[] oddArr = {1,3,5};


        boolean allAreEven = Arrays.stream(evenArr)
                .allMatch(number -> number%2 == 0);

        boolean isThereAnyEven = Arrays.stream(arr)
                        .anyMatch(number -> number % 2 == 0);

        boolean allAreOdd = Arrays.stream(oddArr)
                        .noneMatch(number -> number % 2 == 0);

        System.out.println(allAreEven);
        System.out.println(isThereAnyEven);
        System.out.println(allAreOdd);

    }
}
