package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
        for(int i = 0; i < 10; i++) {
        // define counter;
        // condition
        // increment
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        //numbers[0] = 1
        //numbers[1] = 2

        for (int i = 1; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        //numbers[0] = 1;
        //numbers[1] = 2;
        //numbers[2] = 3;
        //... numbers[9] = 10;
        // 10 < 10 ! false!!

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("=======");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println("Hello");

        for (int number : numbers) {
            System.out.println(number);
        }

        // Create String array with 10 names
        // Print all names using for & for each

        String[] names = {"Janis", "Marcis", "Peteris", "Liga", "Livanis"};
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Peteris")) {
                System.out.println(names[i]);
            }
        }

        System.out.println(Arrays.toString(names));

        System.out.println("========//========");

        for (String name : names) {
            System.out.println(name);
        }


        // do, do while

        /*
        do {
        // code to be executed
        }(while is true)
         */

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        // move numbers from arrayOfNum to emptyArray using loop
        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
            // 1;
            // 2
        }
        // 0
        // emptyArray[0] = 0
        // arrayOfNum[0] = 1;

        //1
        //emptyArray[1] = 0
        //arrayOfNum[1] = 2;

        //[0,0,0,0,0,0,0,0,0,0]
        //[1,0,0,0,0,0,0,0,0,0] emptyArray
        //
        System.out.println(Arrays.toString(emptyArray));

        int j = 0;
        do {
            emptyArray[j] = arrayOfNum[j];
            j++;
        } while (j < arrayOfNum.length);
        System.out.println(Arrays.toString(emptyArray));
    }
}
