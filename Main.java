package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Hello! What is your name?");
        String name = input.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
