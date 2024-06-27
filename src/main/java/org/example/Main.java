package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 integers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Starting Calculator");
        Calc calc = new Calc();
        System.out.println(calc.add(num1, num2));
    }


}