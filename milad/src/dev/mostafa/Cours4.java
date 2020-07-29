package dev.mostafa;

import java.util.Scanner;

public class Cours4 {
    public static void main(String[] args) {
        int a,i;
        i = 0;

        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        System.out.println("please enter yur number:");
        if (a > i) {
            System.out.println(a + " > " + i);
        } else if (a == i) {
            System.out.println(a +" = " + i);
        } else if (a < i) {
            System.out.println(a + " < " + i);
        }
    }
}