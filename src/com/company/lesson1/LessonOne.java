package com.company.lesson1;

public class LessonOne {

    public static void main(String[] args) {
	// Lesson01 - task 01 write a program that print some string 5 times
        String str = "write a program that prints some string 5 times";
        System.out.println (str);
        System.out.println (str);
        System.out.println (str);
        System.out.println (str);
        System.out.println (str);
        // Lesson 01 - task 02 - create all primitive data types

        byte number1 = 15;
        short number2 = 100;
        long number3 = 100000000;
        String phrase = "I try to learn Java";
        char letter = 'D';
        double sum = 145.34567;
        float pi = 3.14f;
        boolean result1 = true;
        boolean result2 = false;
        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        System.out.print(number3 + " ");
        System.out.print(phrase + " ");
        System.out.print(letter + " ");
        System.out.print(sum + " ");
        System.out.print(pi + " ");
        System.out.print(result1 + " ");
        System.out.println (result2 + " ");

        //Lesson 01 - task 3 the square of rectangle
        int length = 5;
        int width = 7;
        int square = length*width;
        System.out.println("square = " + square);

        //Lesson 01 - task 4 fix the program to get result 0.5
        double a = 5;
        double b  = 10;
        double fixResult = (a/b);
        System.out.println (fixResult);

        // Lesson 01 - Task 5 - change the operations ro get 20
        int k = 1;
        int f = 3;
        int c = 9;
        int d = 27;
        //initial task conditions - int result = -a*b/c+d;
        int result = ((d+f)-(c+k));
        System.out.println (result);

        //Lesson 01 - Task 06 - "Happy Java Learning"
        //String s = "Java";
        //System.out.println("Happy");
        //System.out.println("Java Learning");
        //System.out.println("programming");
        System.out.print("Happy Java");
        //System.out.println("weekend");
        //System.out.println(s);
        //System.out.print("Python");
        System.out.print(" ");
        System.out.println("Learning");

    }

}
