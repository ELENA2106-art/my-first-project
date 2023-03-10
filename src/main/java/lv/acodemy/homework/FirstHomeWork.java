package lv.acodemy.homework;

public class FirstHomeWork {
    public static void main(String[] args) {

        int data = 7;
        int year = 2023;

        double temperatureBody = 36.6;
        double temperatureWeight = - 10.5;

        boolean sun = true;
        boolean spring = true;

        char symbol = 36;
        char letter = 76;

        short alphabet = 33;
        short value = -32768;

        float temperatureAir = -7.2F;
        float temperatureWater = 18.5F;

        long line = 123456789012345678L;
        long line2 = -9223372036854775808L;

        System.out.println("int = " + data + "\n" + "int = " + year + "\n" + "double = " + temperatureBody + "\n"
        + "double = " + temperatureWeight + "\n" + "boolean = " + sun + "\n" + "boolean = " + spring + "\n"
        + "char = " + symbol + "\n" + "char = " + letter + "\n" + "short = " + alphabet + "\n" + "short = " + value
        + "\n" + "float = " + temperatureAir + "\n" + "float = " + temperatureWater + "\n" + "long = " + line
        + "\n" + "long = " + line2);
        System.out.println("**********************************************************");


        int a = 72;
        int b = 12;

        System.out.println("sum = " + (a+b) + "\n" + "sub = " + (a-b) + "\n" + "div = " + (a/b)
        + "\n" + "multi = " + (a*b) + "\n" + "remain = " + (a % b));

        System.out.println("************************************************************");

        String name = "Lena.";
        String city = "Riga.";
        String lessons = "Java.";
        String pr = "Privet!";

        System.out.println(pr + "\n" + "My name is " + name + "\n" + "I live in" + city + "\n" + "I study " + lessons );
    }
}
