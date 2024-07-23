package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto","Affogato" };

//        String[] copyTo = new String[7];
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println("Espresso at index :"+Arrays.binarySearch(copyFrom,"Espresso"));
        System.out.println(Arrays.equals(copyFrom,copyTo));
//        Arrays.fill(copyTo,"Hello");
//        for (String coffee : copyTo) {
//            System.out.println(coffee + " ");
//        }
        Arrays.parallelSort(copyFrom);  //concurrently  sorting
        Arrays.sort(copyFrom);  // sequential sorting
        for (String coffee : copyFrom) {
            System.out.println(coffee + " ");
        }

        System.out.println(java.util.Arrays.toString(copyTo));
//        Collections.sort();
    }
}
