package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int [] inputs = new int[10];
        int fin = 0;

        for (int i = 0; i < 10; i++){
            //inputs[i] =
            System.out.println("\n \n Enter a value: ");
            inputs[i] = keyboard.nextInt();
            System.out.print(inputs[i]);
        }
        for (int i = 0; i < 10; i++){
            fin = fin + inputs[i];
        }
        System.out.print(fin);
    }
}
