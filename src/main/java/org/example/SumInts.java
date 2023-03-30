package org.example;

import java.util.ArrayList;

public class SumInts {
    public static int sum(ArrayList<Integer> arr){
        int total =0;
        for(int num: arr){
            if(num%2 ==0) {
                total += num;
                System.out.println(total);
            }
        }
        return total;
    }
    public static void printFiveLettersOnly(ArrayList<String> arr){
        ArrayList<String> hasFive = new ArrayList<>();
        for(String word: arr){
            if(word.length() == 5){
                hasFive.add(word);
            }

        }
        System.out.println(hasFive);
    }
}
