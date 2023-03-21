package lv.acodemy.homework;

import java.util.Arrays;

public class Task_Array {
    static int count = 1;
    static String line = "***********************************************************";

    public static void task() {
        System.out.println(line + "\n" + "\t" + "N" + (count++));
    }

    public static void main(String[] args) {
        task();

        String[] europeanCountries = {"France", "Germany", "Latvia", "Estonia", "Poland", "Austria", "Belgium", "Italy",
                "Finland", "Spain"};
        for (int i = 0; i < europeanCountries.length; i++) {
            System.out.println(europeanCountries[i]);
        }

        System.out.println(Arrays.toString(europeanCountries));

        for (int i = 0; i < europeanCountries.length; i++)
            if (europeanCountries[i].equals("Latvia")) {
                System.out.println("Latvia is my motherland.");
            } else {
                System.out.println(europeanCountries[i]);
            }
        System.out.println(Arrays.toString(europeanCountries));


        task();

        String[] number = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday", "rather", "than", "spending",
                "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code."};


        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println("\n");


        task();

        int salary = 10000;


        if (salary < 5000) {
            System.out.println("Your salary is low.");
        }
        if (salary >= 5000 && salary < 10000) {
            System.out.println("Your salary is average.");
        } else {
            System.out.println("Your salary is high.");

            task();

            int a = 5;

            if (a > 0) {
                System.out.println("The number is positive.");
            }
            if (a < 0) {
                System.out.println("The number is negative.");
            } else if (a == 0) {
                System.out.println("The number is zero.");
            }

        }
    }
}