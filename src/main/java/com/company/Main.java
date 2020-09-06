package com.company;

import com.company.game.Game;
import com.company.util.Checker;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 2 random numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int value1 = calculator.add(a, b);
        int value2 = calculator.minus(a,b);
        long value3 = calculator.multiply(a,b);
        double value4 = calculator.division(a,b);

        System.out.println("The sum of 2 numbers is " + value1);
        System.out.println("The difference between 2 numbers is " + value2);
        System.out.println("Two numbers multiplied gives the result of " + value3);
        System.out.println("Two numbers divided gives the result of " + value4);

        Checker checker = new Checker();
        boolean isEven = checker.isEven(a);
        boolean isOdd = checker.isOdd(a);

        System.out.println("Is it true that the first typed number is even? ");
        System.out.println(isEven);
        System.out.println("Is it true that the first typed number is odd? ");
        System.out.println(isOdd);

Game.game();
    }

}