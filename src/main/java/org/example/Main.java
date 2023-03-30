package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner behold = new Scanner(System.in);
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for (int num : intArray) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        String Sentences = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = Sentences.split("\\. ");
        for (String phrase : words) {
            System.out.println(phrase);
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(154);
        numbers.add(213);
        numbers.add(7);
        numbers.add(23);
        numbers.add(4116);

        numbers.add(1776);
        numbers.add(11);
        numbers.add(24);
        numbers.add(-3);
        numbers.add(12);
        System.out.println(SumInts.sum(numbers));


        ArrayList<String> wordsToTest = new ArrayList<String>();
        wordsToTest.add("Sometimes");
        wordsToTest.add("words");
        wordsToTest.add("are");
        wordsToTest.add("not");
        wordsToTest.add("enough");

        SumInts.printFiveLettersOnly(wordsToTest);

        HashMap<Integer, String> classRoster = new HashMap<>();
            String newStudent;
            do {
            System.out.print("Student: ");
            newStudent = behold.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = behold.nextInt();
                classRoster.put(newID, newStudent);

                behold.nextLine();
            }
        } while(!newStudent.equals(""));

        behold.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}